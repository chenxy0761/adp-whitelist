package com.ideal.adp.whitelist.detail

import com.ideal.adp.whitelist.Field
import com.ideal.adp.whitelist.Whitelist._
import com.ideal.adp.whitelist.account.AccountType
import com.ideal.adp.whitelist.tool.Utilities

/**
 * Created by jason on 2017-03-18.
 */
class SelFunc extends LogicGenerable {
  override def load(): Unit = {
    terminalWhitelist("1550276508", AccountType.IMEI, Field.Url, "apoll.m.taobao.com", gen feature ("imei") add (lstrip))
    terminalWhitelist("1806948284", AccountType.IMEI, Field.Url, "suggest.taobao.com", gen feature ("imei") add (lstrip))
    terminalWhitelist("1902412284", AccountType.IMEI, Field.Url, "api.s.m.taobao.com", gen feature ("imei") add (lstrip))
    terminalWhitelist("-1990712050", AccountType.IMEI, Field.Url, "api.udache.com", gen feature ("imei") add (lstrip))
    terminalWhitelist("-547054692", AccountType.IMEI, Field.Url, "api.m.taobao.com", gen feature ("imei") add (lstrip))
    terminalWhitelist("-663237366", AccountType.IMEI, Field.Url, "utop.umengcloud.com", gen feature ("imei") add (lstrip))

    terminalWhitelist("1512127369", AccountType.MDN, Field.Cookie, "stat.10jqka.com.cn", gen feature ("escapename") regex())

    terminalWhitelist("1669420", AccountType.MDN, Field.Cookie, "in.m.jd.com", gen feature ("pt_pin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("326839529", AccountType.MDN, Field.Cookie, "in.m.jd.com", gen feature ("pwdt_id") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("1300205024", AccountType.MDN, Field.Cookie, "s-nfa.jd.com", gen feature ("_pst") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("1326244437", AccountType.MDN, Field.Cookie, "venus.jd.com", gen feature ("pwdt_id") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-1469096288", AccountType.MDN, Field.Cookie, "mercury.jd.com", gen feature ("_pst") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-1764661803", AccountType.MDN, Field.Cookie, "mercury.jd.com", gen feature ("pwdt_id") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-2026465502", AccountType.MDN, Field.Cookie, "sale.jd.com", gen feature ("pt_pin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("2067481412", AccountType.MDN, Field.Cookie, "un.m.jd.com", gen feature ("pt_pin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-587936830", AccountType.MDN, Field.Cookie, "item.jd.com", gen feature ("_pst") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-595051624", AccountType.MDN, Field.Cookie, "venus.jd.com", gen feature ("pt_pin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-660052584", AccountType.MDN, Field.Cookie, "mercury.jd.com", gen feature ("pt_pin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-683685601", AccountType.MDN, Field.Cookie, "sale.jd.com", gen feature ("pwdt_id") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("691040509", AccountType.MDN, Field.Cookie, "mercury.jd.com", gen feature ("jdpin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("706227587", AccountType.MDN, Field.Cookie, "mercury.jd.com", gen feature ("pin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-884705983", AccountType.MDN, Field.Cookie, "un.m.jd.com", gen feature ("pwdt_id") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-93754547", AccountType.MDN, Field.Cookie, "sale.jd.com", gen feature ("pin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("1782574553", AccountType.MDN, Field.Cookie, "cart.jd.com", gen feature ("pin") contains ("_p") split("_p", 0) regex())
    terminalWhitelist("-1892112970", AccountType.MDN, Field.Cookie, "cart.jd.com", gen feature ("_pst") contains ("_p") split("_p", 0) regex())

    terminalWhitelist("1525206017", AccountType.MAC, Field.Url, "a1.go2yd.com", gen feature ("new_token") subStringX(4, 12))
    terminalWhitelist("1992204608", AccountType.MAC, Field.Url, "a1.go2yd.com", gen feature ("deviceid") subStringX(4, 12))

    terminalWhitelist("1970639009", AccountType.IMEI, Field.Url, "a1.go2yd.com", gen feature ("new_token") subStringX(-1, 12))
    terminalWhitelist("-1032151963", AccountType.MAC, Field.Url, "strip.taobaocdn.com", gen feature ("ps_id") subStringX(-1, 12))
    terminalWhitelist("130023097", AccountType.MAC, Field.Url, "ope.tanx.com", gen feature ("pvid") subStringX(-1, 12))
    terminalWhitelist("-1854184661", AccountType.MAC, Field.Url, "tns.simba.taobao.com", gen feature ("ps_id") subStringX(-1, 12))

    terminalWhitelist("-1667878319", AccountType.MAC, Field.Url, "a.play.api.3g.youku.com", gen feature ("mac") urlDecode())

    terminalWhitelist("1371469139", AccountType.MDN, Field.Cookie, "shop.yhd.com", gen feature ("uname") urlDecode() regex())
    terminalWhitelist("-1854822829", AccountType.MDN, Field.Cookie, "list.yhd.com", gen feature ("uname") urlDecode() regex())
    terminalWhitelist("1931942019", AccountType.MDN, Field.Cookie, "www.yhd.com", gen feature ("uname") urlDecode() regex())
    terminalWhitelist("-1732373469", AccountType.MDN, Field.Cookie, "search.yhd.com", gen feature ("uname") urlDecode() regex())
    terminalWhitelist("-1945987700", AccountType.MDN, Field.Cookie, "e.yhd.com", gen feature ("uname") urlDecode() regex())
    terminalWhitelist("1409100364", AccountType.MDN, Field.Cookie, "webim.yhd.com", gen feature ("uname") urlDecode() regex())
    terminalWhitelist("541934348", AccountType.MDN, Field.Cookie, "tracker.yhd.com", gen feature ("uname") urlDecode() regex())
    terminalWhitelist("775033300", AccountType.MDN, Field.Cookie, "t.yhd.com", gen feature ("uname") urlDecode() regex())

    terminalWhitelist("-1440076154", AccountType.IMEI, Field.Cookie, "h5.m.jd.com", gen feature ("pre_session") urlDecode() regex())
    terminalWhitelist("1985802038", AccountType.IMEI, Field.Cookie, "in.m.jd.com", gen feature ("pre_session") urlDecode() regex())

    terminalWhitelist("-1015694658", AccountType.IMEI, Field.Url, "hm.baidu.com", gen feature ("su") urlDecode() add (reSplist))
    terminalWhitelist("-1089933125", AccountType.IMEI, Field.Url, "hm.baidu.com", gen feature ("u") urlDecode() add (reSplist))
    terminalWhitelist("1770467352", AccountType.IMEI, Field.Url, "z11.cnzz.com", gen feature ("r") urlDecode() add (reSplist))

    terminalWhitelist("610964800", AccountType.MAC, Field.Url, "hm.baidu.com", gen feature ("su") urlDecode() add (reSplistMac) subStringX(-1, 12))
    terminalWhitelist("70409067", AccountType.MAC, Field.Url, "hm.baidu.com", gen feature ("u") urlDecode() add (reSplistMac) subStringX(-1, 12))
    terminalWhitelist("81653192", AccountType.MAC, Field.Url, "z11.cnzz.com", gen feature ("r") urlDecode() add (reSplistMac) subStringX(-1, 12))

    terminalWhitelist("108866531", AccountType.IMEI, Field.Url, "hm.baidu.com", gen feature ("su") urlDecode() add (reSplistMac) add (subString2))
    terminalWhitelist("-304892483", AccountType.IMEI, Field.Url, "z11.cnzz.com", gen feature ("r") urlDecode() add (reSplistMac) add (subString2))

    terminalWhitelist("2142213933", AccountType.MAC, Field.Url, "q14.cnzz.com", gen feature ("r") urlDecode() add (reSplistUserMac))

    terminalWhitelist("-1428352528", AccountType.MAC, Field.Url, "irs01.com", gen feature ("mac1") urlDecode())

    terminalWhitelist("301528740", AccountType.MDN, Field.Url, "mb.hd.sohu.com.cn", gen feature ("passport") urlDecode() regex())

    terminalWhitelist("301528740", AccountType.MDN, Field.Url, "mb.hd.sohu.com.cn", gen feature ("passport") urlDecode() jsonToMap() find ("c4"))

    terminalWhitelist("1297798534", AccountType.IMEI, Field.Url, "qq.com", gen feature ("imei") notContains ("%"))
    terminalWhitelist("1865020416", AccountType.IMEI, Field.Url, "qq.com", gen feature ("device_id") notContains ("%"))
    terminalWhitelist("485420724", AccountType.IMEI, Field.Url, "qq.com", gen feature ("devid") notContains ("%"))

    terminalWhitelist("1016675178", AccountType.IDFA, Field.Url, "iface.iqiyi.com", gen feature ("idfa") notContains ("%") len(36, 36))
    terminalWhitelist("-1268691409", AccountType.IDFA, Field.Url, "logic.content.qq.com", gen feature ("imei") len(36, 36))

    terminalWhitelist("2028492959", AccountType.IMEI, Field.Url, "portal.m.jd.com", gen feature ("uuid") split("-", 0))
    terminalWhitelist("-2043038248", AccountType.IMEI, Field.Url, "imp.adsmogo.com", gen feature ("uuid") split(":", 0))
    terminalWhitelist("-1680539475", AccountType.IMEI, Field.Url, "api.t.iqiyi.com", gen feature ("aqyid") split("_", 0) add (lstrip))

    terminalWhitelist("-145431019", AccountType.MDN, Field.Cookie, "api.m.jd.com", gen feature ("pin") split("_", 0) regex())
    terminalWhitelist("215672344", AccountType.MDN, Field.Cookie, "dd-search.jd.com", gen feature ("_pst") split("_", 0) regex())
    terminalWhitelist("-616547819", AccountType.MDN, Field.Cookie, "dd-search.jd.com", gen feature ("pin") split("_", 0) regex())
    terminalWhitelist("-386857298", AccountType.MDN, Field.Url, "api.apt.k.sogou.com", gen feature ("uid") split("@", 0) regex())
    terminalWhitelist("-1572915950", AccountType.MDN, Field.Cookie, "update.unisdk.163.com", gen feature ("P_INFO") split("\\|", 0) regex())

    terminalWhitelist("1020918665", AccountType.IMEI, Field.Url, "if", gen feature ("aqyid") split("_", 0) notContains ("%"))

    terminalWhitelist("1011612201", AccountType.MAC, Field.Cookie, "h5.m.jd.com", gen feature ("pre_session") split("\\|", 0) split("-", 1))
    terminalWhitelist("1032024740", AccountType.MAC, Field.Cookie, "in.m.jd.com", gen feature ("mac") split("\\|", 0) split("-", 1))
    terminalWhitelist("1255953557", AccountType.MAC, Field.Cookie, "mercury.jd.com", gen feature ("pre_session") split("\\|", 0) split("-", 1))
    terminalWhitelist("1407580318", AccountType.MAC, Field.Cookie, "wn.x.jd.com", gen feature ("mac") split("\\|", 0) split("-", 1))

    terminalWhitelist("-1279119544", AccountType.IMEI, Field.Url, "search.video.iqiyi.com", gen feature ("u") split("_", 0))
    terminalWhitelist("1528652731", AccountType.IMEI, Field.Url, "w.inews.qq.com", gen feature ("mideviceid") split("_", 0))
    terminalWhitelist("1540250925", AccountType.IMEI, Field.Url, "apple.www.letv.com", gen feature ("uuid") split("_", 0))
    terminalWhitelist("449863016", AccountType.IMEI, Field.Url, "w.inews.qq.com", gen feature ("hwdeviceid") split("_", 0))
    terminalWhitelist("47260218", AccountType.IMEI, Field.Url, "serv.vip.iqiyi.com", gen feature ("device_id") split("_", 0))
    terminalWhitelist("-823917869", AccountType.IMEI, Field.Url, "data.video.qiyi.com", gen feature ("qyid") split("_", 0))

    terminalWhitelist("-140435713", AccountType.IMEI, Field.Url, "api.m.jd.com", gen feature ("uuid") split("-", 0))
    terminalWhitelist("-1935728961", AccountType.IMEI, Field.Cookie, "mercury.jd.com", gen feature ("pre_session") split("-", 0))
    terminalWhitelist("-318655829", AccountType.IMEI, Field.Cookie, "un.m.jd.com", gen feature ("pre_session") split("-", 0))
    terminalWhitelist("495502601", AccountType.IMEI, Field.Cookie, "sale.jd.com", gen feature ("pre_session") split("-", 0))
    terminalWhitelist("2034519666", AccountType.MAC, Field.Url, "imp.adsmogo.com", gen feature ("uuid") split(":", 1))

    terminalWhitelist("1060811676", AccountType.ANDROIDID, Field.Url, "iface2.", gen feature ("aqyid") split("_", 1) len(13, 16))
    terminalWhitelist("2058465499", AccountType.IMEI, Field.Url, "blcs.waimai.baidu.com:8066", gen feature ("cuid") split("\\|", 1) add (reverse2))

    terminalWhitelist("-516354689", AccountType.IMEI, Field.Url, "api.m.jd.com", gen feature ("uuid") split("_", 0))

    terminalWhitelist("134960652", AccountType.IMEI, Field.Url, "mc.meituan.net", gen feature ("utm_content"))
    terminalWhitelist("-1471015476", AccountType.IMEI, Field.Url, "lvyou.meituan.com", gen feature ("utm_content"))
    terminalWhitelist("-1888242772", AccountType.IMEI, Field.Url, "billing.mobile.meituan.com", gen feature ("utm_content"))
    terminalWhitelist("911859542", AccountType.IMEI, Field.Url, "api.meituan.com", gen feature ("utm_content"))


    terminalWhitelist("-2110819198", AccountType.IMEI, Field.Url, "common.diditaxi.com.cn", gen feature ("imei"))
    terminalWhitelist("-953477760", AccountType.IMEI, Field.Url, "api.diditaxi.com.cn", gen feature ("imei"))

    terminalWhitelist("1141876332", AccountType.IMEI, Field.Url, "xwapp.auto.qq.com", gen feature ("devid") add (lstripSim))

    terminalWhitelist("-114888741", AccountType.MAC, Field.Url, "ipservice.mogujie.com", gen feature ("did") contains ("mac") add (lstripMac))

    terminalWhitelist("-1032151963", AccountType.MAC, Field.Url, "strip.taobaocdn.com", gen feature ("ps_id") subStringX(-1, 12))

    terminalWhitelist("-1180880864", AccountType.IMEI, Field.Url, "hm.baidu.com", gen feature ("u") urlDecode() add (reSplistMac) add (subString2))

    terminalWhitelist("110764795", AccountType.MAC, Field.Url, "z4.cnzz.com", gen feature ("r") urlDecode() add (reSplistUserMac))

    terminalWhitelist("-1208063143", AccountType.MAC, Field.Url, "api.m.taobao.com", gen feature ("data") urlDecode() jsonToMap() find ("c4"))

    terminalWhitelist("-1160544028", AccountType.ANDROIDID, Field.Url, "upmobile.v.qq.com", gen feature ("device_id") notContains ("%") len(13, 16))

    terminalWhitelist("1016675178", AccountType.IDFA, Field.Url, "iface.iqiyi.com", gen feature ("idfa") notContains ("%") len(36, 36))

    terminalWhitelist("1116513149", AccountType.IMEI, Field.Url, "irs01.com", gen feature ("cupid_id") notContains ("%"))

    terminalWhitelist("1020918665", AccountType.IMEI, Field.Url, "if", gen feature ("aqyid") split("_", 0) notContains ("%"))

    terminalWhitelist("1141927647", AccountType.IMEI, Field.Url, "irs01.com", gen feature ("aqyid") split("_", 0) notContains ("%"))

    terminalWhitelist("1060811676", AccountType.ANDROIDID, Field.Url, "iface2.", gen feature ("aqyid") split("_", 1) len(13, 16))

    terminalWhitelist("1091417597", AccountType.MAC, Field.Url, "api.m.jd.com", gen feature ("uuid") split("-", 1))

    terminalWhitelist("400498027", AccountType.MAC, Field.Url, "utop.umengcloud.com", gen feature ("data") urlDecode() jsonToMap() find ("c4"))
    terminalWhitelist("-856984512", AccountType.MAC, Field.Url, "w.51tv.com", gen feature ("mac") notContains ("@"))

    terminalWhitelist("1129392298", AccountType.MDN, Field.Url, "soufunapp.3g.fang.com", gen feature ("searchdata") regex())
  }

  def lstrip(given: String) = {
    val imei = given.replaceFirst("0", "")
    Some(imei.trim())
  }

  def lstripSim(given: String) = {
    val imei = given.replaceFirst("sim_", "")
    Some(imei.trim())
  }

  def lstripMac(given: String) = {
    val imei = given.replaceFirst("mac", "")
    Some(imei.trim())
  }

  def reSplist(given: String) = {
    Utilities.string2Map(given, "&", "=").get("imei")
  }

  def reSplistMac(given: String) = {
    Utilities.string2Map(given, "&", "=").get("mac")
  }

  def reSplistUserMac(given: String) = {
    Utilities.string2Map(given, "&", "=").get("usermac")
  }

  def subString2(given: String) = {
    val len = given.length
    val end = len - 12
    if (end <= 0) None else Some(given.substring(0, end))
  }

  def reverse2(given: String) = {
    Some(given.reverse)
  }
}


