package com.ex.instagramclone.model

data class User( val username : String, val fullname : String, val photo_url : String , val bio : String ){
    constructor(): this("","","","")
}
