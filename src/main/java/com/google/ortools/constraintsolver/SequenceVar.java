/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class SequenceVar extends PropagationBaseObject {
  private transient long swigCPtr;

  protected SequenceVar(long cPtr, boolean cMemoryOwn) {
    super(operations_research_constraint_solverJNI.SequenceVar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SequenceVar obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_SequenceVar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SequenceVar(Solver s, IntervalVar[] intervals, IntVar[] nexts, String name) {
    this(operations_research_constraint_solverJNI.new_SequenceVar(Solver.getCPtr(s), s, intervals, nexts, name), true);
  }

  public String toString() {
    return operations_research_constraint_solverJNI.SequenceVar_toString(swigCPtr, this);
  }

  public void rankFirst(int index) {
    operations_research_constraint_solverJNI.SequenceVar_rankFirst(swigCPtr, this, index);
  }

  public void rankNotFirst(int index) {
    operations_research_constraint_solverJNI.SequenceVar_rankNotFirst(swigCPtr, this, index);
  }

  public void rankLast(int index) {
    operations_research_constraint_solverJNI.SequenceVar_rankLast(swigCPtr, this, index);
  }

  public void rankNotLast(int index) {
    operations_research_constraint_solverJNI.SequenceVar_rankNotLast(swigCPtr, this, index);
  }

  public void ComputePossibleFirstsAndLasts(SWIGTYPE_p_std__vectorT_int_t possible_firsts, SWIGTYPE_p_std__vectorT_int_t possible_lasts) {
    operations_research_constraint_solverJNI.SequenceVar_ComputePossibleFirstsAndLasts(swigCPtr, this, SWIGTYPE_p_std__vectorT_int_t.getCPtr(possible_firsts), SWIGTYPE_p_std__vectorT_int_t.getCPtr(possible_lasts));
  }

  public void rankSequence(int[] rank_first, int[] rank_last, int[] unperformed) {
    operations_research_constraint_solverJNI.SequenceVar_rankSequence(swigCPtr, this, rank_first, rank_last, unperformed);
  }

  public void FillSequence(SWIGTYPE_p_std__vectorT_int_t rank_first, SWIGTYPE_p_std__vectorT_int_t rank_last, SWIGTYPE_p_std__vectorT_int_t unperformed) {
    operations_research_constraint_solverJNI.SequenceVar_FillSequence(swigCPtr, this, SWIGTYPE_p_std__vectorT_int_t.getCPtr(rank_first), SWIGTYPE_p_std__vectorT_int_t.getCPtr(rank_last), SWIGTYPE_p_std__vectorT_int_t.getCPtr(unperformed));
  }

  public IntervalVar Interval(int index) {
    long cPtr = operations_research_constraint_solverJNI.SequenceVar_Interval(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IntervalVar(cPtr, false);
  }

  public IntVar Next(int index) {
    long cPtr = operations_research_constraint_solverJNI.SequenceVar_Next(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IntVar(cPtr, false);
  }

  public long size() {
    return operations_research_constraint_solverJNI.SequenceVar_size(swigCPtr, this);
  }

  public void accept(ModelVisitor visitor) {
    operations_research_constraint_solverJNI.SequenceVar_accept(swigCPtr, this, ModelVisitor.getCPtr(visitor), visitor);
  }

}
