package com.jd565.b

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass//(embedded = true)
open class RealmMedia(
    var id: String = ""
) : RealmObject()