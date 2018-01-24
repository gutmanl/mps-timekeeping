package Timekeeping.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;

public class MyFactory {
  public static class NodeFactory_874080446224723536 implements NodeFactory {
    public void setup(final SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      ListSequence.fromList(SLinkOperations.getChildren(ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, "Timekeeping.structure.Translation"))).first(), MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x144350812ec117a9L, "strings"))).visitAll(new IVisitor<SNode>() {
        public void visit(SNode it) {
          SNode newKeyword = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179dL, "Timekeeping.structure.LocalizedKeyword"));
          SLinkOperations.setTarget(newKeyword, MetaAdapterFactory.getReferenceLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179dL, 0x3581a114cbed7a78L, "language"), newNode);
          ListSequence.fromList(SLinkOperations.getChildren(it, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179cL, 0x144350812ec117a3L, "keywords"))).addElement(newKeyword);
        }
      });
    }
  }
  public static class NodeFactory_874080446224899657 implements NodeFactory {
    public void setup(final SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      ListSequence.fromList(SLinkOperations.getChildren(ListSequence.fromList(SModelOperations.roots(model, MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, "Timekeeping.structure.Translation"))).first(), MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec117a8L, 0x3581a114cbead4e1L, "languages"))).visitAll(new IVisitor<SNode>() {
        public void visit(SNode it) {
          SNode newKeyword = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179dL, "Timekeeping.structure.LocalizedKeyword"));
          SLinkOperations.setTarget(newKeyword, MetaAdapterFactory.getReferenceLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179dL, 0x3581a114cbed7a78L, "language"), it);
          ListSequence.fromList(SLinkOperations.getChildren(newNode, MetaAdapterFactory.getContainmentLink(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x144350812ec1179cL, 0x144350812ec117a3L, "keywords"))).addElement(newKeyword);
        }
      });
    }
  }
}
