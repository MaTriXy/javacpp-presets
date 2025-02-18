// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Sync extends SyncPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Sync(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    public Sync(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);

    public Sync(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr SyncProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr SyncProperties props);

    /**
     * A map of inputs
     */
    @MemberGetter public native @ByRef InputMap inputs();

    /**
     * Output message of type MessageGroup
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Set the maximal interval between messages in the group
     * @param syncThreshold Maximal interval between messages in the group
     */
    public native void setSyncThreshold(@ByVal @Cast("std::chrono::nanoseconds*") Pointer syncThreshold);

    /**
     * Set the number of attempts to get the specified max interval between messages in the group
     * @param syncAttempts Number of attempts to get the specified max interval between messages in the group:
     *   - if syncAttempts = 0 then the node sends a message as soon at the group is filled
     *   - if syncAttempts > 0 then the node will make syncAttemts attempts to synchronize before sending out a message
     *   - if syncAttempts = -1 (default) then the node will only send a message if successfully synchronized
     */
    public native void setSyncAttempts(int syncAttempts);

    /**
     * Gets the maximal interval between messages in the group in milliseconds
     */
    public native @ByVal @Cast("std::chrono::nanoseconds*") Pointer getSyncThreshold();

    /**
     * Gets the number of sync attempts
     */
    public native int getSyncAttempts();
}
