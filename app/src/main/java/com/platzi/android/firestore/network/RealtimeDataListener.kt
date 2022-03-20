package com.platzi.android.firestore.network

/**
 * @author Santiago Carrillo
 * 3/9/19.
 */

interface RealtimeDataListener<T> {

    fun onDataChange(updatedData: T)

    fun onError(exception: Exception)

}
