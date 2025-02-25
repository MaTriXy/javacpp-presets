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


@Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class streamPacketDesc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public streamPacketDesc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public streamPacketDesc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public streamPacketDesc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public streamPacketDesc_t position(long position) {
        return (streamPacketDesc_t)super.position(position);
    }
    @Override public streamPacketDesc_t getPointer(long i) {
        return new streamPacketDesc_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint8_t*") BytePointer data(); public native streamPacketDesc_t data(BytePointer setter);
    public native @Cast("uint32_t") int length(); public native streamPacketDesc_t length(int setter);
    public native @ByRef XLinkTimespec tRemoteSent(); public native streamPacketDesc_t tRemoteSent(XLinkTimespec setter); /** remote timestamp of when the packet was sent. Related to remote clock. Note: not directly related to local clock */
    public native @ByRef XLinkTimespec tReceived(); public native streamPacketDesc_t tReceived(XLinkTimespec setter); /** local timestamp of when the packet was received. Related to local monotonic clock */
}
