// Targeted by JavaCPP version 1.5.11: DO NOT EDIT THIS FILE

package org.bytedeco.hyperscan;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hyperscan.global.hyperscan.*;

// #endif

/**
 * Definition of the stream identifier type.
 */
@Opaque @Properties(inherit = org.bytedeco.hyperscan.presets.hyperscan.class)
public class hs_stream extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public hs_stream() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public hs_stream(Pointer p) { super(p); }
}
