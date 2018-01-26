package Timekeeping.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.lang.editor.table.runtime.TableModelFactory;
import jetbrains.mps.lang.editor.table.runtime.TableModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.openapi.editor.cells.SubstituteInfo;
import jetbrains.mps.smodel.action.SNodeFactoryOperations;
import Timekeeping.behavior.IntlLanguage__BehaviorDescriptor;
import jetbrains.mps.openapi.editor.cells.EditorCell_Collection;
import jetbrains.mps.lang.editor.table.runtime.EditorCell_Table;

/*package*/ class Translation_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Translation_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createTable_74egzh_a();
  }

  private EditorCell createTable_74egzh_a() {
    TableModelFactory creator = new TableModelFactory() {
      public TableModel createTableModel() {
        return new TableModel() {
          public int getColumnCount() {
            return ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x3581a114cbead4e1L, "languages"))).count() + 1;
          }
          public int getRowCount() {
            return ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x144350812ec117a9L, "strings"))).count() + 1;
          }
          public void deleteRow(int rowNumber) {
            if (rowNumber != 0) {
              SNodeOperations.deleteNode(ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x144350812ec117a9L, "strings"))).getElement(rowNumber));
            }
          }
          public SNode getValueAt(int row, final int column) {
            if (row == 0) {
              if (column != 0) {
                return ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x3581a114cbead4e1L, "languages"))).getElement(column - 1);
              } else {
                return null;
              }
            } else {
              if (column == 0) {
                return ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x144350812ec117a9L, "strings"))).getElement(row - 1);
              } else {
                return ListSequence.fromList(SLinkOperations.getChildren(ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x144350812ec117a9L, "strings"))).getElement(row - 1), MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179cL, 0x144350812ec117a3L, "keywords"))).findFirst(new IWhereFilter<SNode>() {
                  public boolean accept(SNode it) {
                    return SLinkOperations.getTarget(it, MetaAdapterFactory.getReferenceLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179dL, 0x3581a114cbed7a78L, "language")) == ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x3581a114cbead4e1L, "languages"))).getElement(column - 1);
                  }
                });
              }
            }
          }
          public void createElement(int row, int column) {
            // Creation of an individual cell shouldn't be possible 
          }
          public SubstituteInfo getSubstituteInfo(int row, int column) {
            return null;
          }
          public void insertRow(int rowNumber) {
            SNodeFactoryOperations.addNewChild(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x144350812ec117a9L, "strings"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179cL, "Timekeeping.structure.IntlAlias")));
          }
          public void deleteColumn(int columnNumber) {
            if (columnNumber != 0) {
              SNode languageToDelete = ListSequence.fromList(SLinkOperations.getChildren(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x3581a114cbead4e1L, "languages"))).getElement(columnNumber - 1);
              IntlLanguage__BehaviorDescriptor.customDelete_id6cSWq1JoJeE.invoke(languageToDelete, getEditorContext());

            }
          }
          public void insertColumn(int columnNumber) {
            SNodeFactoryOperations.addNewChild(myNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x3581a114cbead4e1L, "languages"), SNodeFactoryOperations.asInstanceConcept(MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3581a114cbea3e7bL, "Timekeeping.structure.IntlLanguage")));
          }
          public int getMaxColumnWidth(int columnNumber) {
            return 100;
          }
        };
      }
    };
    EditorCell_Collection editorCell = EditorCell_Table.createTable(getEditorContext(), myNode, creator.createTableModel(), "Table_74egzh_a");
    editorCell.setCellId("Table_74egzh_a_0");
    editorCell.setBig(true);
    editorCell.setCellContext(getCellFactory().getCellContext());
    return editorCell;
  }
}
