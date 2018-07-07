/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.google.ortools.constraintsolver;

public class AssignmentIntContainer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected AssignmentIntContainer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AssignmentIntContainer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        operations_research_constraint_solverJNI.delete_AssignmentIntContainer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public AssignmentIntContainer() {
    this(operations_research_constraint_solverJNI.new_AssignmentIntContainer(), true);
  }

  public IntVarElement add(IntVar var) {
    long cPtr = operations_research_constraint_solverJNI.AssignmentIntContainer_add(swigCPtr, this, IntVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public IntVarElement FastAdd(IntVar var) {
    long cPtr = operations_research_constraint_solverJNI.AssignmentIntContainer_FastAdd(swigCPtr, this, IntVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public IntVarElement addAtPosition(IntVar var, int position) {
    long cPtr = operations_research_constraint_solverJNI.AssignmentIntContainer_addAtPosition(swigCPtr, this, IntVar.getCPtr(var), var, position);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public void clear() {
    operations_research_constraint_solverJNI.AssignmentIntContainer_clear(swigCPtr, this);
  }

  public void Resize(long size) {
    operations_research_constraint_solverJNI.AssignmentIntContainer_Resize(swigCPtr, this, size);
  }

  public boolean empty() {
    return operations_research_constraint_solverJNI.AssignmentIntContainer_empty(swigCPtr, this);
  }

  public void CopyIntersection(AssignmentIntContainer container) {
    operations_research_constraint_solverJNI.AssignmentIntContainer_CopyIntersection(swigCPtr, this, AssignmentIntContainer.getCPtr(container), container);
  }

  public void copy(AssignmentIntContainer container) {
    operations_research_constraint_solverJNI.AssignmentIntContainer_copy(swigCPtr, this, AssignmentIntContainer.getCPtr(container), container);
  }

  public boolean contains(IntVar var) {
    return operations_research_constraint_solverJNI.AssignmentIntContainer_contains(swigCPtr, this, IntVar.getCPtr(var), var);
  }

  public IntVarElement MutableElement(IntVar var) {
    long cPtr = operations_research_constraint_solverJNI.AssignmentIntContainer_MutableElement__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public IntVarElement MutableElementOrNull(IntVar var) {
    long cPtr = operations_research_constraint_solverJNI.AssignmentIntContainer_MutableElementOrNull(swigCPtr, this, IntVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public IntVarElement element(IntVar var) {
    return new IntVarElement(operations_research_constraint_solverJNI.AssignmentIntContainer_element__SWIG_0(swigCPtr, this, IntVar.getCPtr(var), var), false);
  }

  public IntVarElement ElementPtrOrNull(IntVar var) {
    long cPtr = operations_research_constraint_solverJNI.AssignmentIntContainer_ElementPtrOrNull(swigCPtr, this, IntVar.getCPtr(var), var);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_operations_research__IntVarElement_t elements() {
    return new SWIGTYPE_p_std__vectorT_operations_research__IntVarElement_t(operations_research_constraint_solverJNI.AssignmentIntContainer_elements(swigCPtr, this), false);
  }

  public IntVarElement MutableElement(int index) {
    long cPtr = operations_research_constraint_solverJNI.AssignmentIntContainer_MutableElement__SWIG_1(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IntVarElement(cPtr, false);
  }

  public IntVarElement element(int index) {
    return new IntVarElement(operations_research_constraint_solverJNI.AssignmentIntContainer_element__SWIG_1(swigCPtr, this, index), false);
  }

  public int size() {
    return operations_research_constraint_solverJNI.AssignmentIntContainer_size(swigCPtr, this);
  }

  public void store() {
    operations_research_constraint_solverJNI.AssignmentIntContainer_store(swigCPtr, this);
  }

  public void Restore() {
    operations_research_constraint_solverJNI.AssignmentIntContainer_Restore(swigCPtr, this);
  }

}
