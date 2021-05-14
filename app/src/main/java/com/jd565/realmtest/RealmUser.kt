package com.jd565.realmtest

import com.jd565.b.RealmMedia
import io.realm.RealmObject

open class RealmUser(
    var media: RealmMedia? = null
) : RealmObject()