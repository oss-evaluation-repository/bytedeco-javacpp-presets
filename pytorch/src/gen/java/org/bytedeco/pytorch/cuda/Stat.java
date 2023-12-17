// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Error;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


// TODO: Turn this into an honest to goodness class. I briefly attempted to do
// this, but it was a bit irritating to figure out how to also correctly
// apply pimpl pattern so I didn't have to leak any internal implementation
// details in the header (CUDACachingAllocator could be made a pimpl, but
// you also need to appropriately define a class which is a subclass
// of Allocator. Not impossible, but required a bit more surgery than
// I wanted to do at the time.)
//
// Why is this using a namespace rather than old-style THCCachingAllocator_
// prefix?  Mostly because it made the HIPify rules easier to write; _ is
// not counted as a word boundary, so you would otherwise have to list each
// of these functions.

@Namespace("c10::cuda::CUDACachingAllocator") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class Stat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Stat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Stat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Stat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Stat position(long position) {
        return (Stat)super.position(position);
    }
    @Override public Stat getPointer(long i) {
        return new Stat((Pointer)this).offsetAddress(i);
    }

  public native @Cast("int64_t") long current(); public native Stat current(long setter);
  public native @Cast("int64_t") long peak(); public native Stat peak(long setter);
  public native @Cast("int64_t") long allocated(); public native Stat allocated(long setter);
  public native @Cast("int64_t") long freed(); public native Stat freed(long setter);
}