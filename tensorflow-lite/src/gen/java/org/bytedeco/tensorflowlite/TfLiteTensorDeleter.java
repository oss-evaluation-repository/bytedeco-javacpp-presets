// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// `unique_ptr` wrapper for `TfLiteTensor`s.
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteTensorDeleter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteTensorDeleter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteTensorDeleter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteTensorDeleter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteTensorDeleter position(long position) {
        return (TfLiteTensorDeleter)super.position(position);
    }
    @Override public TfLiteTensorDeleter getPointer(long i) {
        return new TfLiteTensorDeleter((Pointer)this).offsetAddress(i);
    }

  public native @Name("operator ()") void apply(TfLiteTensor t);
}