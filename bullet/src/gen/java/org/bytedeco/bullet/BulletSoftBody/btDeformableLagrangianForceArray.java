// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletSoftBody;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;
import org.bytedeco.bullet.BulletCollision.*;
import static org.bytedeco.bullet.global.BulletCollision.*;
import org.bytedeco.bullet.BulletDynamics.*;
import static org.bytedeco.bullet.global.BulletDynamics.*;

import static org.bytedeco.bullet.global.BulletSoftBody.*;

@Name("btAlignedObjectArray<btDeformableLagrangianForce*>") @NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletSoftBody.class)
public class btDeformableLagrangianForceArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btDeformableLagrangianForceArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public btDeformableLagrangianForceArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public btDeformableLagrangianForceArray position(long position) {
        return (btDeformableLagrangianForceArray)super.position(position);
    }
    @Override public btDeformableLagrangianForceArray getPointer(long i) {
        return new btDeformableLagrangianForceArray((Pointer)this).offsetAddress(i);
    }

	public native @ByRef @Name("operator =") btDeformableLagrangianForceArray put(@Const @ByRef btDeformableLagrangianForceArray other);
	public btDeformableLagrangianForceArray() { super((Pointer)null); allocate(); }
	private native void allocate();

	/**Generally it is best to avoid using the copy constructor of an btAlignedObjectArray, and use a (const) reference to the array instead. */
	public btDeformableLagrangianForceArray(@Const @ByRef btDeformableLagrangianForceArray otherArray) { super((Pointer)null); allocate(otherArray); }
	private native void allocate(@Const @ByRef btDeformableLagrangianForceArray otherArray);

	/** return the number of elements in the array */
	public native int size();

	public native @ByPtrRef btDeformableLagrangianForce at(int n);

	public native @ByPtrRef @Name("operator []") btDeformableLagrangianForce get(int n);

	/**clear the array, deallocated memory. Generally it is better to use array.resize(0), to reduce performance overhead of run-time memory (de)allocations. */
	public native void clear();

	public native void pop_back();

	/**resize changes the number of elements in the array. If the new size is larger, the new elements will be constructed using the optional second argument.
	 * when the new number of elements is smaller, the destructor will be called, but memory will not be freed, to reduce performance overhead of run-time memory (de)allocations. */
	public native void resizeNoInitialize(int newsize);

	public native void resize(int newsize, @ByPtrRef btDeformableLagrangianForce fillData/*=btDeformableLagrangianForce*()*/);
	public native void resize(int newsize);
	public native @ByPtrRef btDeformableLagrangianForce expandNonInitializing();

	public native @ByPtrRef btDeformableLagrangianForce expand(@ByPtrRef btDeformableLagrangianForce fillValue/*=btDeformableLagrangianForce*()*/);
	public native @ByPtrRef btDeformableLagrangianForce expand();

	public native void push_back(@ByPtrRef btDeformableLagrangianForce _Val);

	/** return the pre-allocated (reserved) elements, this is at least as large as the total number of elements,see size() and reserve() */
	public native @Name("capacity") int _capacity();

	public native void reserve(int _Count);

	/**heap sort from http://www.csse.monash.edu.au/~lloyd/tildeAlgDS/Sort/Heap/ */ /*downHeap*/

	public native void swap(int index0, int index1);

	/**non-recursive binary search, assumes sorted array */
	public native int findBinarySearch(@ByPtrRef btDeformableLagrangianForce key);

	public native int findLinearSearch(@ByPtrRef btDeformableLagrangianForce key);

	// If the key is not in the array, return -1 instead of 0,
	// since 0 also means the first element in the array.
	public native int findLinearSearch2(@ByPtrRef btDeformableLagrangianForce key);

	public native void removeAtIndex(int index);
	public native void remove(@ByPtrRef btDeformableLagrangianForce key);

	//PCK: whole function
	public native void initializeFromBuffer(Pointer buffer, int size, int _capacity);

	public native void copyFromArray(@Const @ByRef btDeformableLagrangianForceArray otherArray);
}
