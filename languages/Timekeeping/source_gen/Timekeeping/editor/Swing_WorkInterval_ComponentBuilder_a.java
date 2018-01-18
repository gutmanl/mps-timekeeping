package Timekeeping.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import javax.swing.JComponent;
import javax.swing.JLabel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class Swing_WorkInterval_ComponentBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Swing_WorkInterval_ComponentBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createJComponent_t4exyj_a();
  }

  private EditorCell createJComponent_t4exyj_a() {
    EditorCell editorCell = EditorCell_Component.createComponentCell(getEditorContext(), myNode, _QueryFunction_JComponent_t4exyj_a0(), "_t4exyj_a");
    editorCell.setCellId("JComponent_t4exyj_a");
    return editorCell;
  }
  private JComponent _QueryFunction_JComponent_t4exyj_a0() {
    JLabel label = new JLabel();
    label.setText(SPropertyOperations.getString(myNode, MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f38737L, "begin")) + SPropertyOperations.getString(myNode, MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f38739L, "end")) + SPropertyOperations.getString(myNode, MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f3873cL, "description")));
    return label;
  }
}