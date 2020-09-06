package com.compilacionmovil.ejemplodatastore

import androidx.datastore.CorruptionException
import androidx.datastore.Serializer
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException
import java.io.InputStream
import java.io.OutputStream

object ProtoDataSourceSerializer: Serializer<SchemeProtoDataSource> {

    override fun readFrom(input: InputStream): SchemeProtoDataSource {
        try {
            return SchemeProtoDataSource.parseFrom(input)
        } catch (exception: InvalidProtocolBufferException) {
            throw CorruptionException("Cannot read proto.", exception)
        }

    }

    override fun writeTo(t: SchemeProtoDataSource, output: OutputStream) {
        t.writeTo(output)
    }
}