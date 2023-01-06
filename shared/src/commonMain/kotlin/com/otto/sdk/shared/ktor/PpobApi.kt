package com.otto.sdk.shared.ktor

import com.otto.sdk.shared.response.UserInfoResult

interface PpobApi {
  suspend fun getUserInfo(timeStamp:String,userToken:String,phoneNumber:String) : UserInfoResult
}