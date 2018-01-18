package Timekeeping.editor;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.PropertySupport;

public class TimekeepingTableDataProvider implements TableDataProvider {
  /*package*/ SNode record;

  public Object getColumn(SNode n, int i) {
    switch (i) {
      case 0:
        return SPropertyOperations.getString(SNodeOperations.cast(n, MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, "Timekeeping.structure.WorkInterval")), MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f38737L, "begin"));
      case 1:
        return SPropertyOperations.getString(SNodeOperations.cast(n, MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, "Timekeeping.structure.WorkInterval")), MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f38739L, "end"));
      case 2:
        return SPropertyOperations.getString(SNodeOperations.cast(n, MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, "Timekeeping.structure.WorkInterval")), MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f3873cL, "description"));
      default:
        return "Invalid column index";
    }
  }

  public void setColumn(SNode n, int i, Object o) {
    switch (i) {
      case 0:
        SPropertyOperations.set(SNodeOperations.cast(n, MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, "Timekeeping.structure.WorkInterval")), MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f38737L, "begin"), o.toString());
      case 1:
        SPropertyOperations.set(SNodeOperations.cast(n, MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, "Timekeeping.structure.WorkInterval")), MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f38739L, "end"), o.toString());
      case 2:
        SPropertyOperations.set(SNodeOperations.cast(n, MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, "Timekeeping.structure.WorkInterval")), MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f3873cL, "description"), o.toString());
    }
  }

  public int getColumnCount() {
    return 4;
  }

  public String[] getColumnNames() {
    String[] columns = {"Begin", "End", "Description", "Action"};
    return columns;
  }

  public boolean validColumnValue(SNode n, int i, Object o) {
    SProperty property;
    switch (i) {
      case 0:
        property = MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f38737L, "begin");
        break;
      case 1:
        property = MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f38739L, "end");
        break;
      case 2:
        property = MetaAdapterFactory.getProperty(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L, 0x3d9500dd65f3873cL, "description");
        break;
      default:
        return false;
    }
    return false;

  }

  public boolean ICantCommentOutAGoddamnLineOfCode(SProperty property, SNode n, Object o) {
    return PropertySupport.getPropertySupport(property).canSetValue(n, property, o.toString());
  }
}