// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.bullet.BulletCollision;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.bullet.LinearMath.*;
import static org.bytedeco.bullet.global.LinearMath.*;

import static org.bytedeco.bullet.global.BulletCollision.*;


/**The btBvhTriangleMeshShape is a static-triangle mesh shape, it can only be used for fixed/non-moving objects.
 * If you required moving concave triangle meshes, it is recommended to perform convex decomposition
 * using HACD, see Bullet/Demos/ConvexDecompositionDemo.
 * Alternatively, you can use btGimpactMeshShape for moving concave triangle meshes.
 * btBvhTriangleMeshShape has several optimizations, such as bounding volume hierarchy and
 * cache friendly traversal for PlayStation 3 Cell SPU.
 * It is recommended to enable useQuantizedAabbCompression for better memory usage.
 * It takes a triangle mesh as input, for example a btTriangleMesh or btTriangleIndexVertexArray. The btBvhTriangleMeshShape class allows for triangle mesh deformations by a refit or partialRefit method.
 * Instead of building the bounding volume hierarchy acceleration structure, it is also possible to serialize (save) and deserialize (load) the structure from disk.
 * See Demos\ConcaveDemo\ConcavePhysicsDemo.cpp for an example. */
@NoOffset @Properties(inherit = org.bytedeco.bullet.presets.BulletCollision.class)
public class btBvhTriangleMeshShape extends btTriangleMeshShape {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public btBvhTriangleMeshShape(Pointer p) { super(p); }


	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Cast("bool") boolean buildBvh/*=true*/) { super((Pointer)null); allocate(meshInterface, useQuantizedAabbCompression, buildBvh); }
	private native void allocate(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Cast("bool") boolean buildBvh/*=true*/);
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression) { super((Pointer)null); allocate(meshInterface, useQuantizedAabbCompression); }
	private native void allocate(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression);

	/**optionally pass in a larger bvh aabb, used for quantization. This allows for deformations within this aabb */
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Const @ByRef btVector3 bvhAabbMin, @Const @ByRef btVector3 bvhAabbMax, @Cast("bool") boolean buildBvh/*=true*/) { super((Pointer)null); allocate(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax, buildBvh); }
	private native void allocate(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Const @ByRef btVector3 bvhAabbMin, @Const @ByRef btVector3 bvhAabbMax, @Cast("bool") boolean buildBvh/*=true*/);
	public btBvhTriangleMeshShape(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Const @ByRef btVector3 bvhAabbMin, @Const @ByRef btVector3 bvhAabbMax) { super((Pointer)null); allocate(meshInterface, useQuantizedAabbCompression, bvhAabbMin, bvhAabbMax); }
	private native void allocate(btStridingMeshInterface meshInterface, @Cast("bool") boolean useQuantizedAabbCompression, @Const @ByRef btVector3 bvhAabbMin, @Const @ByRef btVector3 bvhAabbMax);

	public native @Cast("bool") boolean getOwnsBvh();

	public native void performRaycast(btTriangleCallback callback, @Const @ByRef btVector3 raySource, @Const @ByRef btVector3 rayTarget);
	public native void performConvexcast(btTriangleCallback callback, @Const @ByRef btVector3 boxSource, @Const @ByRef btVector3 boxTarget, @Const @ByRef btVector3 boxMin, @Const @ByRef btVector3 boxMax);

	public native void processAllTriangles(btTriangleCallback callback, @Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);

	public native void refitTree(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);

	/**for a fast incremental refit of parts of the tree. Note: the entire AABB of the tree will become more conservative, it never shrinks */
	public native void partialRefitTree(@Const @ByRef btVector3 aabbMin, @Const @ByRef btVector3 aabbMax);

	//debugging
	public native @Cast("const char*") BytePointer getName();

	public native void setLocalScaling(@Const @ByRef btVector3 scaling);

	public native btOptimizedBvh getOptimizedBvh();

	public native void setOptimizedBvh(btOptimizedBvh bvh, @Const @ByRef(nullValue = "btVector3(1, 1, 1)") btVector3 localScaling);
	public native void setOptimizedBvh(btOptimizedBvh bvh);

	public native void buildOptimizedBvh();

	public native @Cast("bool") boolean usesQuantizedAabbCompression();

	public native void setTriangleInfoMap(btTriangleInfoMap triangleInfoMap);

	public native btTriangleInfoMap getTriangleInfoMap();

	public native int calculateSerializeBufferSize();

	/**fills the dataBuffer and returns the struct name (and 0 on failure) */
	public native @Cast("const char*") BytePointer serialize(Pointer dataBuffer, btSerializer serializer);

	public native void serializeSingleBvh(btSerializer serializer);

	public native void serializeSingleTriangleInfoMap(btSerializer serializer);
}
