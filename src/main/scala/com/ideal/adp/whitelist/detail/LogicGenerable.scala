package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.LogicDefine

trait LogicGenerable extends Serializable {
    @transient
    val gens = LogicDefine.multiLogicGenerator()
    @transient
    val gen = LogicDefine.logicGenerator()
    def load()
}
