package com.example.davidsteam.domain.entity

class Message(
    var id: Int,
    var text:String,
    var deleted: Boolean,
    var sender: User
) {

}