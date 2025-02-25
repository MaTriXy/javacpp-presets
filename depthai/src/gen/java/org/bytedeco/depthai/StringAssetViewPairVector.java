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

@Name("std::vector<std::pair<std::string,dai::AssetView> >") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StringAssetViewPairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringAssetViewPairVector(Pointer p) { super(p); }
    public StringAssetViewPairVector()       { allocate();  }
    private native void allocate();


    public boolean empty() { return size() == 0; }
    public native long size();

    @Index(function = "at") public native @StdString BytePointer first(@Cast("size_t") long i); public native StringAssetViewPairVector first(@Cast("size_t") long i, BytePointer first);
    @Index(function = "at") public native @ByRef AssetView second(@Cast("size_t") long i);  public native StringAssetViewPairVector second(@Cast("size_t") long i, AssetView second);
}

