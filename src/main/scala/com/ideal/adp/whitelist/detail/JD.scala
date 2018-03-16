package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType

class Jd extends LogicGenerable { 
override def load(): Unit = { 
    terminalWhitelist("-2011145323", AccountType.MAC,Field.Cookie,"www.jd.com", gen feature ("pre_session") split("\\|",0) split("-",1))
    terminalWhitelist("1091417597", AccountType.MAC,Field.Url,"api.m.jd.com", gen feature ("uuid")  split("-",1))
    terminalWhitelist("-112114109", AccountType.MDN,Field.Cookie,"s-nfa.jd.com", gen feature ("pin") contains("_p") split("_p",0) regex())
    terminalWhitelist("-1955922913", AccountType.MAC,Field.Cookie,"sale.jd.com", gen feature ("pre_session") split("\\|",0) split("-",1))
    terminalWhitelist("1167016165", AccountType.MDN,Field.Cookie,"item.jd.com", gen feature ("pin") contains("_p") split("_p",0) regex())
    terminalWhitelist("400200409", AccountType.MAC,Field.Cookie,"in.m.jd.com", gen feature ("pre_session") split("\\|",0) split("-",1))
    terminalWhitelist("1300205024", AccountType.MDN,Field.Cookie,"s-nfa.jd.com", gen feature ("_pst") contains("_p") split("_p",0) regex())
    terminalWhitelist("1326244437", AccountType.MDN,Field.Cookie,"venus.jd.com", gen feature ("pwdt_id") contains("_p") split("_p",0) regex())
    terminalWhitelist("2129779765", AccountType.IMEI,Field.Url,"api.m.jd.com", gen feature ("uuid") split("-",0) )
    terminalWhitelist("885060686", AccountType.IMEI,Field.Cookie,"h5.m.jd.com", gen feature ("pre_session") urlDecode() regex() )
    terminalWhitelist("-145431019", AccountType.MDN,Field.Cookie,"api.m.jd.com", gen feature ("pin") split("_",0) regex())
    terminalWhitelist("-1469096288", AccountType.MDN,Field.Cookie,"mercury.jd.com", gen feature ("_pst") contains("_p") split("_p",0) regex())
    terminalWhitelist("1255953557", AccountType.MAC,Field.Cookie,"mercury.jd.com", gen feature ("pre_session") split("\\|",0) split("-",1))
    terminalWhitelist("1669420", AccountType.MDN,Field.Cookie,"in.m.jd.com", gen feature ("pt_pin") contains("_p") split("_p",0))
    terminalWhitelist("-1764661803", AccountType.MDN,Field.Cookie,"mercury.jd.com", gen feature ("pwdt_id") contains("_p") split("_p",0) regex())
    terminalWhitelist("1782574553", AccountType.MDN,Field.Cookie,"cart.jd.com", gen feature ("pin") contains("_p") subStringX(0,11))
    terminalWhitelist("1871542614", AccountType.MDN,Field.Cookie,"h5.m.jd.com", gen feature ("pt_pin") subStringX(0,11) regex())
    terminalWhitelist("-1892112970", AccountType.MDN,Field.Cookie,"cart.jd.com", gen feature ("_pst") contains("_p") subStringX(0,11))
    terminalWhitelist("1604519029", AccountType.IMEI,Field.Cookie,"mercury.jd.com", gen feature ("pre_session") split("-",0) )
    terminalWhitelist("1011612201", AccountType.MAC,Field.Cookie,"h5.m.jd.com", gen feature ("pre_session") split("\\|",0) split("-",1))
    terminalWhitelist("1032024740", AccountType.MAC,Field.Cookie,"in.m.jd.com", gen feature ("mac") split("\\|",0) split("-",1))
    terminalWhitelist("1973716382", AccountType.IMEI,Field.Cookie,"in.m.jd.com", gen feature ("pre_session") urlDecode() regex() )
    terminalWhitelist("-2026465502", AccountType.MDN,Field.Cookie,"sale.jd.com", gen feature ("pt_pin") contains("_p") split("_p",0) regex())
    terminalWhitelist("1932861077", AccountType.IMEI,Field.Url,"portal.m.jd.com", gen feature ("uuid") split("-",0))
    terminalWhitelist("2067481412", AccountType.MDN,Field.Cookie,"un.m.jd.com", gen feature ("pt_pin") contains("_p") split("_p",0) regex())
    terminalWhitelist("215672344", AccountType.MDN,Field.Cookie,"dd-search.jd.com", gen feature ("_pst") split("_",0) regex())
    terminalWhitelist("1407580318", AccountType.MAC,Field.Cookie,"wn.x.jd.com", gen feature ("mac") split("\\|",0) split("-",1))
    terminalWhitelist("-1502669466", AccountType.MAC,Field.Url,"wn.x.jd.com", gen feature ("mac") urlDecode())
    terminalWhitelist("299281673", AccountType.IMEI,Field.Cookie,"un.m.jd.com", gen feature ("pre_session") split("-",0) )
    terminalWhitelist("326839529", AccountType.MDN,Field.Cookie,"in.m.jd.com", gen feature ("pwdt_id") contains("_p") split("_p",0))
    terminalWhitelist("1072240619", AccountType.IMEI,Field.Cookie,"sale.jd.com", gen feature ("pre_session") split("-",0) )
    terminalWhitelist("508754003", AccountType.MDN,Field.Cookie,"h5.m.jd.com", gen feature ("pwdt_id") subStringX(0,11) regex())
    terminalWhitelist("-1128342091", AccountType.IMEI,Field.Url,"api.m.jd.com", gen feature ("uuid")  split("_",0) )
    terminalWhitelist("-587936830", AccountType.MDN,Field.Cookie,"item.jd.com", gen feature ("_pst") contains("_p") split("_p",0) regex())
    terminalWhitelist("-595051624", AccountType.MDN,Field.Cookie,"venus.jd.com", gen feature ("pt_pin") contains("_p") split("_p",0) regex())
    terminalWhitelist("-616547819", AccountType.MDN,Field.Cookie,"dd-search.jd.com", gen feature ("pin") split("_",0) regex())
    terminalWhitelist("-660052584", AccountType.MDN,Field.Cookie,"mercury.jd.com", gen feature ("pt_pin") contains("_p") split("_p",0) regex())
    terminalWhitelist("-683685601", AccountType.MDN,Field.Cookie,"sale.jd.com", gen feature ("pwdt_id") contains("_p") split("_p",0) regex())
    terminalWhitelist("691040509", AccountType.MDN,Field.Cookie,"mercury.jd.com", gen feature ("jdpin") contains("_p") split("_p",0) regex())
    terminalWhitelist("706227587", AccountType.MDN,Field.Cookie,"mercury.jd.com", gen feature ("pin") contains("_p") split("_p",0) regex())
    terminalWhitelist("-884705983", AccountType.MDN,Field.Cookie,"un.m.jd.com", gen feature ("pwdt_id") contains("_p") split("_p",0) regex())
    terminalWhitelist("-93754547", AccountType.MDN,Field.Cookie,"sale.jd.com", gen feature ("pin") contains("_p") split("_p",0) regex())
    terminalWhitelist("758167612", AccountType.MDN,Field.Cookie,"www.jd.com", gen feature ("pt_pin") )
    terminalWhitelist("1323764409", AccountType.MDN,Field.Cookie,"www.jd.com", gen feature ("pwdt_id") )
	}
}