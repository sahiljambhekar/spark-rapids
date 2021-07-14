// automatically generated by the FlatBuffers compiler, do not modify

package com.nvidia.spark.rapids.format;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class BufferTransferRequest extends Table {
  public static BufferTransferRequest getRootAsBufferTransferRequest(ByteBuffer _bb) { return getRootAsBufferTransferRequest(_bb, new BufferTransferRequest()); }
  public static BufferTransferRequest getRootAsBufferTransferRequest(ByteBuffer _bb, BufferTransferRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public BufferTransferRequest __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * ID of table to transfer
   */
  public int bufferId() { int o = __offset(4); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  public boolean mutateBufferId(int buffer_id) { int o = __offset(4); if (o != 0) { bb.putInt(o + bb_pos, buffer_id); return true; } else { return false; } }

  public static int createBufferTransferRequest(FlatBufferBuilder builder,
      int buffer_id) {
    builder.startObject(1);
    BufferTransferRequest.addBufferId(builder, buffer_id);
    return BufferTransferRequest.endBufferTransferRequest(builder);
  }

  public static void startBufferTransferRequest(FlatBufferBuilder builder) { builder.startObject(1); }
  public static void addBufferId(FlatBufferBuilder builder, int bufferId) { builder.addInt(0, bufferId, 0); }
  public static int endBufferTransferRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

