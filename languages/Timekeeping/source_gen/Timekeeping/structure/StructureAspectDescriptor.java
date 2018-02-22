package Timekeeping.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptDailyTimeRecord = createDescriptorForDailyTimeRecord();
  /*package*/ final ConceptDescriptor myConceptMonthlyTimeRecord = createDescriptorForMonthlyTimeRecord();
  /*package*/ final ConceptDescriptor myConceptWorkInterval = createDescriptorForWorkInterval();
  private final LanguageConceptSwitch myConceptIndex;

  public StructureAspectDescriptor() {
    myConceptIndex = new LanguageConceptSwitch();
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptDailyTimeRecord, myConceptMonthlyTimeRecord, myConceptWorkInterval);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myConceptIndex.index(id)) {
      case LanguageConceptSwitch.DailyTimeRecord:
        return myConceptDailyTimeRecord;
      case LanguageConceptSwitch.MonthlyTimeRecord:
        return myConceptMonthlyTimeRecord;
      case LanguageConceptSwitch.WorkInterval:
        return myConceptWorkInterval;
      default:
        return null;
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myConceptIndex.index(c);
  }

  private static ConceptDescriptor createDescriptorForDailyTimeRecord() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Timekeeping", "DailyTimeRecord", 0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f386f8L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.parent(0x69a000cb56db442fL, 0xa085a182111bac09L, 0x133bf0310e6e97L);
    b.origin("r:069c894f-154c-4238-a338-f810181c3225(Timekeeping.structure)/4437453958741722872");
    b.prop("day", 0x3d9500dd65f386fbL, "4437453958741722875");
    b.aggregate("intervals", 0x3d9500dd65f38703L).target(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L).optional(true).ordered(true).multiple(true).origin("4437453958741722883").done();
    b.alias("day");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMonthlyTimeRecord() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Timekeeping", "MonthlyTimeRecord", 0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38695L);
    b.class_(false, false, true);
    b.origin("r:069c894f-154c-4238-a338-f810181c3225(Timekeeping.structure)/4437453958741722773");
    b.prop("month", 0x3d9500dd65f38696L, "4437453958741722774");
    b.prop("year", 0x3d9500dd65f386f5L, "4437453958741722869");
    b.aggregate("days", 0x3d9500dd65f386ffL).target(0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f386f8L).optional(true).ordered(true).multiple(true).origin("4437453958741722879").done();
    b.alias("month");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWorkInterval() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("Timekeeping", "WorkInterval", 0xd3ca43b801a74083L, 0xba4e9769ab8f1643L, 0x3d9500dd65f38701L);
    b.class_(false, false, false);
    b.origin("r:069c894f-154c-4238-a338-f810181c3225(Timekeeping.structure)/4437453958741722881");
    b.prop("begin", 0x3d9500dd65f38737L, "4437453958741722935");
    b.prop("end", 0x3d9500dd65f38739L, "4437453958741722937");
    b.prop("description", 0x3d9500dd65f3873cL, "4437453958741722940");
    b.alias("interval");
    return b.create();
  }
}
