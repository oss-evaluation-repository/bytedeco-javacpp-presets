// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flandmark;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.flandmark.global.flandmark.*;


@Properties(inherit = org.bytedeco.flandmark.presets.flandmark.class)
public class FLANDMARK_Data extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FLANDMARK_Data() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FLANDMARK_Data(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FLANDMARK_Data(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FLANDMARK_Data position(long position) {
        return (FLANDMARK_Data)super.position(position);
    }

    public native FLANDMARK_LBP lbp(); public native FLANDMARK_Data lbp(FLANDMARK_LBP lbp);
    public native int imSize(int i); public native FLANDMARK_Data imSize(int i, int imSize);
    @MemberGetter public native IntPointer imSize();
    public native IntPointer mapTable(); public native FLANDMARK_Data mapTable(IntPointer mapTable);
    public native @ByRef FLANDMARK_Options options(); public native FLANDMARK_Data options(FLANDMARK_Options options);
}