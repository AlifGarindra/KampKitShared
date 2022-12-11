package com.otto.sdk.shared.kampkit

import co.touchlab.kermit.Logger
import kotlinx.coroutines.CoroutineExceptionHandler

fun kermitExceptionHandler(log: Logger) = CoroutineExceptionHandler { _, throwable ->
    throwable.printStackTrace()
    log.e(throwable = throwable) { "Error in MainScope" }
}
