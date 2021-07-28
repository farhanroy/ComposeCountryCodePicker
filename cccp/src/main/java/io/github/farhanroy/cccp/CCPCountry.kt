package io.github.farhanroy.cccp


import io.github.farhanroy.cccp.R


var DEFAULT_FLAG_RES = -99

data class CCPCountry(
    val nameCode: String,
    val phoneCode: String,
    val name: String,
    val flagResID: Int = DEFAULT_FLAG_RES
)

fun getFlagMasterResID(CCPCountry: CCPCountry): Int {
    return when (CCPCountry.nameCode.toLowerCase()) {
        "ad" -> R.drawable.flag_andorra
        "ae" -> R.drawable.flag_uae
        "af" -> R.drawable.flag_afghanistan
        "ag" -> R.drawable.flag_antigua_and_barbuda
        "ai" -> R.drawable.flag_anguilla
        "al" -> R.drawable.flag_albania
        "am" -> R.drawable.flag_armenia
        "ao" -> R.drawable.flag_angola
        "aq" -> R.drawable.flag_antarctica
        "ar" -> R.drawable.flag_argentina
        "as" -> R.drawable.flag_american_samoa
        "at" -> R.drawable.flag_austria
        "au" -> R.drawable.flag_australia
        "aw" -> R.drawable.flag_aruba
        "ax" -> R.drawable.flag_aland
        "az" -> R.drawable.flag_azerbaijan
        "ba" -> R.drawable.flag_bosnia
        "bb" -> R.drawable.flag_barbados
        "bd" -> R.drawable.flag_bangladesh
        "be" -> R.drawable.flag_belgium
        "bf" -> R.drawable.flag_burkina_faso
        "bg" -> R.drawable.flag_bulgaria
        "bh" -> R.drawable.flag_bahrain
        "bi" -> R.drawable.flag_burundi
        "bj" -> R.drawable.flag_benin
        "bl" -> R.drawable.flag_saint_barthelemy // custom
        "bm" -> R.drawable.flag_bermuda
        "bn" -> R.drawable.flag_brunei
        "bo" -> R.drawable.flag_bolivia
        "br" -> R.drawable.flag_brazil
        "bs" -> R.drawable.flag_bahamas
        "bt" -> R.drawable.flag_bhutan
        "bw" -> R.drawable.flag_botswana
        "by" -> R.drawable.flag_belarus
        "bz" -> R.drawable.flag_belize
        "ca" -> R.drawable.flag_canada
        "cc" -> R.drawable.flag_cocos // custom
        "cd" -> R.drawable.flag_democratic_republic_of_the_congo
        "cf" -> R.drawable.flag_central_african_republic
        "cg" -> R.drawable.flag_republic_of_the_congo
        "ch" -> R.drawable.flag_switzerland
        "ci" -> R.drawable.flag_cote_divoire
        "ck" -> R.drawable.flag_cook_islands
        "cl" -> R.drawable.flag_chile
        "cm" -> R.drawable.flag_cameroon
        "cn" -> R.drawable.flag_china
        "co" -> R.drawable.flag_colombia
        "cr" -> R.drawable.flag_costa_rica
        "cu" -> R.drawable.flag_cuba
        "cv" -> R.drawable.flag_cape_verde
        "cw" -> R.drawable.flag_curacao
        "cx" -> R.drawable.flag_christmas_island
        "cy" -> R.drawable.flag_cyprus
        "cz" -> R.drawable.flag_czech_republic
        "de" -> R.drawable.flag_germany
        "dj" -> R.drawable.flag_djibouti
        "dk" -> R.drawable.flag_denmark
        "dm" -> R.drawable.flag_dominica
        "do" -> R.drawable.flag_dominican_republic
        "dz" -> R.drawable.flag_algeria
        "ec" -> R.drawable.flag_ecuador
        "ee" -> R.drawable.flag_estonia
        "eg" -> R.drawable.flag_egypt
        "er" -> R.drawable.flag_eritrea
        "es" -> R.drawable.flag_spain
        "et" -> R.drawable.flag_ethiopia
        "fi" -> R.drawable.flag_finland
        "fj" -> R.drawable.flag_fiji
        "fk" -> R.drawable.flag_falkland_islands
        "fm" -> R.drawable.flag_micronesia
        "fo" -> R.drawable.flag_faroe_islands
        "fr" -> R.drawable.flag_france
        "ga" -> R.drawable.flag_gabon
        "gb" -> R.drawable.flag_united_kingdom
        "gd" -> R.drawable.flag_grenada
        "ge" -> R.drawable.flag_georgia
        "gf" -> R.drawable.flag_guyane
        "gg" -> R.drawable.flag_guernsey
        "gh" -> R.drawable.flag_ghana
        "gi" -> R.drawable.flag_gibraltar
        "gl" -> R.drawable.flag_greenland
        "gm" -> R.drawable.flag_gambia
        "gn" -> R.drawable.flag_guinea
        "gp" -> R.drawable.flag_guadeloupe
        "gq" -> R.drawable.flag_equatorial_guinea
        "gr" -> R.drawable.flag_greece
        "gt" -> R.drawable.flag_guatemala
        "gu" -> R.drawable.flag_guam
        "gw" -> R.drawable.flag_guinea_bissau
        "gy" -> R.drawable.flag_guyana
        "hk" -> R.drawable.flag_hong_kong
        "hn" -> R.drawable.flag_honduras
        "hr" -> R.drawable.flag_croatia
        "ht" -> R.drawable.flag_haiti
        "hu" -> R.drawable.flag_hungary
        "id" -> R.drawable.flag_indonesia
        "ie" -> R.drawable.flag_ireland
        "il" -> R.drawable.flag_israel
        "im" -> R.drawable.flag_isleof_man // custom
        "is" -> R.drawable.flag_iceland
        "in" -> R.drawable.flag_india
        "io" -> R.drawable.flag_british_indian_ocean_territory
        "iq" -> R.drawable.flag_iraq_new
        "ir" -> R.drawable.flag_iran
        "it" -> R.drawable.flag_italy
        "je" -> R.drawable.flag_jersey
        "jm" -> R.drawable.flag_jamaica
        "jo" -> R.drawable.flag_jordan
        "jp" -> R.drawable.flag_japan
        "ke" -> R.drawable.flag_kenya
        "kg" -> R.drawable.flag_kyrgyzstan
        "kh" -> R.drawable.flag_cambodia
        "ki" -> R.drawable.flag_kiribati
        "km" -> R.drawable.flag_comoros
        "kn" -> R.drawable.flag_saint_kitts_and_nevis
        "kp" -> R.drawable.flag_north_korea
        "kr" -> R.drawable.flag_south_korea
        "kw" -> R.drawable.flag_kuwait
        "ky" -> R.drawable.flag_cayman_islands
        "kz" -> R.drawable.flag_kazakhstan
        "la" -> R.drawable.flag_laos
        "lb" -> R.drawable.flag_lebanon
        "lc" -> R.drawable.flag_saint_lucia
        "li" -> R.drawable.flag_liechtenstein
        "lk" -> R.drawable.flag_sri_lanka
        "lr" -> R.drawable.flag_liberia
        "ls" -> R.drawable.flag_lesotho
        "lt" -> R.drawable.flag_lithuania
        "lu" -> R.drawable.flag_luxembourg
        "lv" -> R.drawable.flag_latvia
        "ly" -> R.drawable.flag_libya
        "ma" -> R.drawable.flag_morocco
        "mc" -> R.drawable.flag_monaco
        "md" -> R.drawable.flag_moldova
        "me" -> R.drawable.flag_of_montenegro // custom
        "mf" -> R.drawable.flag_saint_martin
        "mg" -> R.drawable.flag_madagascar
        "mh" -> R.drawable.flag_marshall_islands
        "mk" -> R.drawable.flag_macedonia
        "ml" -> R.drawable.flag_mali
        "mm" -> R.drawable.flag_myanmar
        "mn" -> R.drawable.flag_mongolia
        "mo" -> R.drawable.flag_macao
        "mp" -> R.drawable.flag_northern_mariana_islands
        "mq" -> R.drawable.flag_martinique
        "mr" -> R.drawable.flag_mauritania
        "ms" -> R.drawable.flag_montserrat
        "mt" -> R.drawable.flag_malta
        "mu" -> R.drawable.flag_mauritius
        "mv" -> R.drawable.flag_maldives
        "mw" -> R.drawable.flag_malawi
        "mx" -> R.drawable.flag_mexico
        "my" -> R.drawable.flag_malaysia
        "mz" -> R.drawable.flag_mozambique
        "na" -> R.drawable.flag_namibia
        "nc" -> R.drawable.flag_new_caledonia // custom
        "ne" -> R.drawable.flag_niger
        "nf" -> R.drawable.flag_norfolk_island
        "ng" -> R.drawable.flag_nigeria
        "ni" -> R.drawable.flag_nicaragua
        "nl" -> R.drawable.flag_netherlands
        "no" -> R.drawable.flag_norway
        "np" -> R.drawable.flag_nepal
        "nr" -> R.drawable.flag_nauru
        "nu" -> R.drawable.flag_niue
        "nz" -> R.drawable.flag_new_zealand
        "om" -> R.drawable.flag_oman
        "pa" -> R.drawable.flag_panama
        "pe" -> R.drawable.flag_peru
        "pf" -> R.drawable.flag_french_polynesia
        "pg" -> R.drawable.flag_papua_new_guinea
        "ph" -> R.drawable.flag_philippines
        "pk" -> R.drawable.flag_pakistan
        "pl" -> R.drawable.flag_poland
        "pm" -> R.drawable.flag_saint_pierre
        "pn" -> R.drawable.flag_pitcairn_islands
        "pr" -> R.drawable.flag_puerto_rico
        "ps" -> R.drawable.flag_palestine
        "pt" -> R.drawable.flag_portugal
        "pw" -> R.drawable.flag_palau
        "py" -> R.drawable.flag_paraguay
        "qa" -> R.drawable.flag_qatar
        "re" -> R.drawable.flag_martinique // no exact flag found
        "ro" -> R.drawable.flag_romania
        "rs" -> R.drawable.flag_serbia // custom
        "ru" -> R.drawable.flag_russian_federation
        "rw" -> R.drawable.flag_rwanda
        "sa" -> R.drawable.flag_saudi_arabia
        "sb" -> R.drawable.flag_soloman_islands
        "sc" -> R.drawable.flag_seychelles
        "sd" -> R.drawable.flag_sudan
        "se" -> R.drawable.flag_sweden
        "sg" -> R.drawable.flag_singapore
        "sh" -> R.drawable.flag_saint_helena // custom
        "si" -> R.drawable.flag_slovenia
        "sk" -> R.drawable.flag_slovakia
        "sl" -> R.drawable.flag_sierra_leone
        "sm" -> R.drawable.flag_san_marino
        "sn" -> R.drawable.flag_senegal
        "so" -> R.drawable.flag_somalia
        "sr" -> R.drawable.flag_suriname
        "ss" -> R.drawable.flag_south_sudan
        "st" -> R.drawable.flag_sao_tome_and_principe
        "sv" -> R.drawable.flag_el_salvador
        "sx" -> R.drawable.flag_sint_maarten
        "sy" -> R.drawable.flag_syria
        "sz" -> R.drawable.flag_swaziland
        "tc" -> R.drawable.flag_turks_and_caicos_islands
        "td" -> R.drawable.flag_chad
        "tg" -> R.drawable.flag_togo
        "th" -> R.drawable.flag_thailand
        "tj" -> R.drawable.flag_tajikistan
        "tk" -> R.drawable.flag_tokelau // custom
        "tl" -> R.drawable.flag_timor_leste
        "tm" -> R.drawable.flag_turkmenistan
        "tn" -> R.drawable.flag_tunisia
        "to" -> R.drawable.flag_tonga
        "tr" -> R.drawable.flag_turkey
        "tt" -> R.drawable.flag_trinidad_and_tobago
        "tv" -> R.drawable.flag_tuvalu
        "tw" -> R.drawable.flag_taiwan
        "tz" -> R.drawable.flag_tanzania
        "ua" -> R.drawable.flag_ukraine
        "ug" -> R.drawable.flag_uganda
        "us" -> R.drawable.flag_united_states_of_america
        "uy" -> R.drawable.flag_uruguay
        "uz" -> R.drawable.flag_uzbekistan
        "va" -> R.drawable.flag_vatican_city
        "vc" -> R.drawable.flag_saint_vicent_and_the_grenadines
        "ve" -> R.drawable.flag_venezuela
        "vg" -> R.drawable.flag_british_virgin_islands
        "vi" -> R.drawable.flag_us_virgin_islands
        "vn" -> R.drawable.flag_vietnam
        "vu" -> R.drawable.flag_vanuatu
        "wf" -> R.drawable.flag_wallis_and_futuna
        "ws" -> R.drawable.flag_samoa
        "xk" -> R.drawable.flag_kosovo
        "ye" -> R.drawable.flag_yemen
        "yt" -> R.drawable.flag_martinique // no exact flag found
        "za" -> R.drawable.flag_south_africa
        "zm" -> R.drawable.flag_zambia
        "zw" -> R.drawable.flag_zimbabwe
        else -> R.drawable.flag_transparent
    }
}

fun getFlagEmoji(CCPCountry: CCPCountry): String? {
    return when (CCPCountry.nameCode.toLowerCase()) {
        "ad" -> "🇦🇩"
        "ae" -> "🇦🇪"
        "af" -> "🇦🇫"
        "ag" -> "🇦🇬"
        "ai" -> "🇦🇮"
        "al" -> "🇦🇱"
        "am" -> "🇦🇲"
        "ao" -> "🇦🇴"
        "aq" -> "🇦🇶"
        "ar" -> "🇦🇷"
        "as" -> "🇦🇸"
        "at" -> "🇦🇹"
        "au" -> "🇦🇺"
        "aw" -> "🇦🇼"
        "ax" -> "🇦🇽"
        "az" -> "🇦🇿"
        "ba" -> "🇧🇦"
        "bb" -> "🇧🇧"
        "bd" -> "🇧🇩"
        "be" -> "🇧🇪"
        "bf" -> "🇧🇫"
        "bg" -> "🇧🇬"
        "bh" -> "🇧🇭"
        "bi" -> "🇧🇮"
        "bj" -> "🇧🇯"
        "bl" -> "🇧🇱"
        "bm" -> "🇧🇲"
        "bn" -> "🇧🇳"
        "bo" -> "🇧🇴"
        "bq" -> "🇧🇶"
        "br" -> "🇧🇷"
        "bs" -> "🇧🇸"
        "bt" -> "🇧🇹"
        "bv" -> "🇧🇻"
        "bw" -> "🇧🇼"
        "by" -> "🇧🇾"
        "bz" -> "🇧🇿"
        "ca" -> "🇨🇦"
        "cc" -> "🇨🇨"
        "cd" -> "🇨🇩"
        "cf" -> "🇨🇫"
        "cg" -> "🇨🇬"
        "ch" -> "🇨🇭"
        "ci" -> "🇨🇮"
        "ck" -> "🇨🇰"
        "cl" -> "🇨🇱"
        "cm" -> "🇨🇲"
        "cn" -> "🇨🇳"
        "co" -> "🇨🇴"
        "cr" -> "🇨🇷"
        "cu" -> "🇨🇺"
        "cv" -> "🇨🇻"
        "cw" -> "🇨🇼"
        "cx" -> "🇨🇽"
        "cy" -> "🇨🇾"
        "cz" -> "🇨🇿"
        "de" -> "🇩🇪"
        "dj" -> "🇩🇯"
        "dk" -> "🇩🇰"
        "dm" -> "🇩🇲"
        "do" -> "🇩🇴"
        "dz" -> "🇩🇿"
        "ec" -> "🇪🇨"
        "ee" -> "🇪🇪"
        "eg" -> "🇪🇬"
        "eh" -> "🇪🇭"
        "er" -> "🇪🇷"
        "es" -> "🇪🇸"
        "et" -> "🇪🇹"
        "fi" -> "🇫🇮"
        "fj" -> "🇫🇯"
        "fk" -> "🇫🇰"
        "fm" -> "🇫🇲"
        "fo" -> "🇫🇴"
        "fr" -> "🇫🇷"
        "ga" -> "🇬🇦"
        "gb" -> "🇬🇧"
        "gd" -> "🇬🇩"
        "ge" -> "🇬🇪"
        "gf" -> "🇬🇫"
        "gg" -> "🇬🇬"
        "gh" -> "🇬🇭"
        "gi" -> "🇬🇮"
        "gl" -> "🇬🇱"
        "gm" -> "🇬🇲"
        "gn" -> "🇬🇳"
        "gp" -> "🇬🇵"
        "gq" -> "🇬🇶"
        "gr" -> "🇬🇷"
        "gs" -> "🇬🇸"
        "gt" -> "🇬🇹"
        "gu" -> "🇬🇺"
        "gw" -> "🇬🇼"
        "gy" -> "🇬🇾"
        "hk" -> "🇭🇰"
        "hm" -> "🇭🇲"
        "hn" -> "🇭🇳"
        "hr" -> "🇭🇷"
        "ht" -> "🇭🇹"
        "hu" -> "🇭🇺"
        "id" -> "🇮🇩"
        "ie" -> "🇮🇪"
        "il" -> "🇮🇱"
        "im" -> "🇮🇲"
        "in" -> "🇮🇳"
        "io" -> "🇮🇴"
        "iq" -> "🇮🇶"
        "ir" -> "🇮🇷"
        "is" -> "🇮🇸"
        "it" -> "🇮🇹"
        "je" -> "🇯🇪"
        "jm" -> "🇯🇲"
        "jo" -> "🇯🇴"
        "jp" -> "🇯🇵"
        "ke" -> "🇰🇪"
        "kg" -> "🇰🇬"
        "kh" -> "🇰🇭"
        "ki" -> "🇰🇮"
        "km" -> "🇰🇲"
        "kn" -> "🇰🇳"
        "kp" -> "🇰🇵"
        "kr" -> "🇰🇷"
        "kw" -> "🇰🇼"
        "ky" -> "🇰🇾"
        "kz" -> "🇰🇿"
        "la" -> "🇱🇦"
        "lb" -> "🇱🇧"
        "lc" -> "🇱🇨"
        "li" -> "🇱🇮"
        "lk" -> "🇱🇰"
        "lr" -> "🇱🇷"
        "ls" -> "🇱🇸"
        "lt" -> "🇱🇹"
        "lu" -> "🇱🇺"
        "lv" -> "🇱🇻"
        "ly" -> "🇱🇾"
        "ma" -> "🇲🇦"
        "mc" -> "🇲🇨"
        "md" -> "🇲🇩"
        "me" -> "🇲🇪"
        "mf" -> "🇲🇫"
        "mg" -> "🇲🇬"
        "mh" -> "🇲🇭"
        "mk" -> "🇲🇰"
        "ml" -> "🇲🇱"
        "mm" -> "🇲🇲"
        "mn" -> "🇲🇳"
        "mo" -> "🇲🇴"
        "mp" -> "🇲🇵"
        "mq" -> "🇲🇶"
        "mr" -> "🇲🇷"
        "ms" -> "🇲🇸"
        "mt" -> "🇲🇹"
        "mu" -> "🇲🇺"
        "mv" -> "🇲🇻"
        "mw" -> "🇲🇼"
        "mx" -> "🇲🇽"
        "my" -> "🇲🇾"
        "mz" -> "🇲🇿"
        "na" -> "🇳🇦"
        "nc" -> "🇳🇨"
        "ne" -> "🇳🇪"
        "nf" -> "🇳🇫"
        "ng" -> "🇳🇬"
        "ni" -> "🇳🇮"
        "nl" -> "🇳🇱"
        "no" -> "🇳🇴"
        "np" -> "🇳🇵"
        "nr" -> "🇳🇷"
        "nu" -> "🇳🇺"
        "nz" -> "🇳🇿"
        "om" -> "🇴🇲"
        "pa" -> "🇵🇦"
        "pe" -> "🇵🇪"
        "pf" -> "🇵🇫"
        "pg" -> "🇵🇬"
        "ph" -> "🇵🇭"
        "pk" -> "🇵🇰"
        "pl" -> "🇵🇱"
        "pm" -> "🇵🇲"
        "pn" -> "🇵🇳"
        "pr" -> "🇵🇷"
        "ps" -> "🇵🇸"
        "pt" -> "🇵🇹"
        "pw" -> "🇵🇼"
        "py" -> "🇵🇾"
        "qa" -> "🇶🇦"
        "re" -> "🇷🇪"
        "ro" -> "🇷🇴"
        "rs" -> "🇷🇸"
        "ru" -> "🇷🇺"
        "rw" -> "🇷🇼"
        "sa" -> "🇸🇦"
        "sb" -> "🇸🇧"
        "sc" -> "🇸🇨"
        "sd" -> "🇸🇩"
        "se" -> "🇸🇪"
        "sg" -> "🇸🇬"
        "sh" -> "🇸🇭"
        "si" -> "🇸🇮"
        "sj" -> "🇸🇯"
        "sk" -> "🇸🇰"
        "sl" -> "🇸🇱"
        "sm" -> "🇸🇲"
        "sn" -> "🇸🇳"
        "so" -> "🇸🇴"
        "sr" -> "🇸🇷"
        "ss" -> "🇸🇸"
        "st" -> "🇸🇹"
        "sv" -> "🇸🇻"
        "sx" -> "🇸🇽"
        "sy" -> "🇸🇾"
        "sz" -> "🇸🇿"
        "tc" -> "🇹🇨"
        "td" -> "🇹🇩"
        "tf" -> "🇹🇫"
        "tg" -> "🇹🇬"
        "th" -> "🇹🇭"
        "tj" -> "🇹🇯"
        "tk" -> "🇹🇰"
        "tl" -> "🇹🇱"
        "tm" -> "🇹🇲"
        "tn" -> "🇹🇳"
        "to" -> "🇹🇴"
        "tr" -> "🇹🇷"
        "tt" -> "🇹🇹"
        "tv" -> "🇹🇻"
        "tw" -> "🇹🇼"
        "tz" -> "🇹🇿"
        "ua" -> "🇺🇦"
        "ug" -> "🇺🇬"
        "um" -> "🇺🇲"
        "us" -> "🇺🇸"
        "uy" -> "🇺🇾"
        "uz" -> "🇺🇿"
        "va" -> "🇻🇦"
        "vc" -> "🇻🇨"
        "ve" -> "🇻🇪"
        "vg" -> "🇻🇬"
        "vi" -> "🇻🇮"
        "vn" -> "🇻🇳"
        "vu" -> "🇻🇺"
        "wf" -> "🇼🇫"
        "ws" -> "🇼🇸"
        "xk" -> "🇽🇰"
        "ye" -> "🇾🇪"
        "yt" -> "🇾🇹"
        "za" -> "🇿🇦"
        "zm" -> "🇿🇲"
        "zw" -> "🇿🇼"
        else -> " "
    }
}

fun getLibraryMasterCountriesEnglish(): List<CCPCountry> {
    val countries: MutableList<CCPCountry> = ArrayList()
    countries.add(CCPCountry("ad", "376", "Andorra", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ae", "971", "United Arab Emirates (UAE)", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("af", "93", "Afghanistan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ag", "1", "Antigua and Barbuda", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ai", "1", "Anguilla", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("al", "355", "Albania", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("am", "374", "Armenia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ao", "244", "Angola", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("aq", "672", "Antarctica", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ar", "54", "Argentina", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("as", "1", "American Samoa", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("at", "43", "Austria", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("au", "61", "Australia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("aw", "297", "Aruba", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ax", "358", "Åland Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("az", "994", "Azerbaijan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ba", "387", "Bosnia And Herzegovina", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bb", "1", "Barbados", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bd", "880", "Bangladesh", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("be", "32", "Belgium", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bf", "226", "Burkina Faso", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bg", "359", "Bulgaria", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bh", "973", "Bahrain", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bi", "257", "Burundi", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bj", "229", "Benin", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bl", "590", "Saint Barthélemy", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bm", "1", "Bermuda", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bn", "673", "Brunei Darussalam", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bo", "591", "Bolivia, Plurinational State Of", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("br", "55", "Brazil", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bs", "1", "Bahamas", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bt", "975", "Bhutan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bw", "267", "Botswana", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("by", "375", "Belarus", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("bz", "501", "Belize", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ca", "1", "Canada", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cc", "61", "Cocos (keeling) Islands", DEFAULT_FLAG_RES))
    countries.add(
        CCPCountry(
            "cd",
            "243",
            "Congo, The Democratic Republic Of The",
            DEFAULT_FLAG_RES
        )
    )
    countries.add(CCPCountry("cf", "236", "Central African Republic", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cg", "242", "Congo", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ch", "41", "Switzerland", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ci", "225", "Côte D'ivoire", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ck", "682", "Cook Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cl", "56", "Chile", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cm", "237", "Cameroon", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cn", "86", "China", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("co", "57", "Colombia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cr", "506", "Costa Rica", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cu", "53", "Cuba", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cv", "238", "Cape Verde", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cw", "599", "Curaçao", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cx", "61", "Christmas Island", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cy", "357", "Cyprus", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("cz", "420", "Czech Republic", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("de", "49", "Germany", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("dj", "253", "Djibouti", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("dk", "45", "Denmark", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("dm", "1", "Dominica", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("do", "1", "Dominican Republic", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("dz", "213", "Algeria", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ec", "593", "Ecuador", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ee", "372", "Estonia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("eg", "20", "Egypt", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("er", "291", "Eritrea", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("es", "34", "Spain", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("et", "251", "Ethiopia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("fi", "358", "Finland", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("fj", "679", "Fiji", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("fk", "500", "Falkland Islands (malvinas)", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("fm", "691", "Micronesia, Federated States Of", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("fo", "298", "Faroe Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("fr", "33", "France", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ga", "241", "Gabon", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gb", "44", "United Kingdom", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gd", "1", "Grenada", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ge", "995", "Georgia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gf", "594", "French Guyana", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gh", "233", "Ghana", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gi", "350", "Gibraltar", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gl", "299", "Greenland", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gm", "220", "Gambia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gn", "224", "Guinea", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gp", "450", "Guadeloupe", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gq", "240", "Equatorial Guinea", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gr", "30", "Greece", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gt", "502", "Guatemala", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gu", "1", "Guam", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gw", "245", "Guinea-bissau", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("gy", "592", "Guyana", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("hk", "852", "Hong Kong", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("hn", "504", "Honduras", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("hr", "385", "Croatia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ht", "509", "Haiti", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("hu", "36", "Hungary", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("id", "62", "Indonesia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ie", "353", "Ireland", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("il", "972", "Israel", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("im", "44", "Isle Of Man", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("is", "354", "Iceland", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("in", "91", "India", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("io", "246", "British Indian Ocean Territory", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("iq", "964", "Iraq", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ir", "98", "Iran, Islamic Republic Of", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("it", "39", "Italy", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("je", "44", "Jersey ", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("jm", "1", "Jamaica", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("jo", "962", "Jordan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("jp", "81", "Japan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ke", "254", "Kenya", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("kg", "996", "Kyrgyzstan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("kh", "855", "Cambodia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ki", "686", "Kiribati", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("km", "269", "Comoros", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("kn", "1", "Saint Kitts and Nevis", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("kp", "850", "North Korea", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("kr", "82", "South Korea", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("kw", "965", "Kuwait", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ky", "1", "Cayman Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("kz", "7", "Kazakhstan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("la", "856", "Lao People's Democratic Republic", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("lb", "961", "Lebanon", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("lc", "1", "Saint Lucia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("li", "423", "Liechtenstein", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("lk", "94", "Sri Lanka", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("lr", "231", "Liberia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ls", "266", "Lesotho", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("lt", "370", "Lithuania", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("lu", "352", "Luxembourg", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("lv", "371", "Latvia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ly", "218", "Libya", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ma", "212", "Morocco", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mc", "377", "Monaco", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("md", "373", "Moldova, Republic Of", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("me", "382", "Montenegro", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mf", "590", "Saint Martin", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mg", "261", "Madagascar", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mh", "692", "Marshall Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mk", "389", "Macedonia (FYROM)", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ml", "223", "Mali", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mm", "95", "Myanmar", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mn", "976", "Mongolia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mo", "853", "Macau", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mp", "1", "Northern Mariana Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mq", "596", "Martinique", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mr", "222", "Mauritania", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ms", "1", "Montserrat", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mt", "356", "Malta", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mu", "230", "Mauritius", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mv", "960", "Maldives", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mw", "265", "Malawi", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mx", "52", "Mexico", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("my", "60", "Malaysia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("mz", "258", "Mozambique", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("na", "264", "Namibia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("nc", "687", "New Caledonia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ne", "227", "Niger", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("nf", "672", "Norfolk Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ng", "234", "Nigeria", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ni", "505", "Nicaragua", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("nl", "31", "Netherlands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("no", "47", "Norway", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("np", "977", "Nepal", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("nr", "674", "Nauru", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("nu", "683", "Niue", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("nz", "64", "New Zealand", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("om", "968", "Oman", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pa", "507", "Panama", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pe", "51", "Peru", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pf", "689", "French Polynesia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pg", "675", "Papua New Guinea", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ph", "63", "Philippines", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pk", "92", "Pakistan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pl", "48", "Poland", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pm", "508", "Saint Pierre And Miquelon", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pn", "870", "Pitcairn Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pr", "1", "Puerto Rico", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ps", "970", "Palestine", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pt", "351", "Portugal", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("pw", "680", "Palau", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("py", "595", "Paraguay", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("qa", "974", "Qatar", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("re", "262", "Réunion", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ro", "40", "Romania", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("rs", "381", "Serbia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ru", "7", "Russian Federation", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("rw", "250", "Rwanda", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sa", "966", "Saudi Arabia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sb", "677", "Solomon Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sc", "248", "Seychelles", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sd", "249", "Sudan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("se", "46", "Sweden", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sg", "65", "Singapore", DEFAULT_FLAG_RES))
    countries.add(
        CCPCountry(
            "sh",
            "290",
            "Saint Helena, Ascension And Tristan Da Cunha",
            DEFAULT_FLAG_RES
        )
    )
    countries.add(CCPCountry("si", "386", "Slovenia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sk", "421", "Slovakia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sl", "232", "Sierra Leone", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sm", "378", "San Marino", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sn", "221", "Senegal", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("so", "252", "Somalia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sr", "597", "Suriname", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ss", "211", "South Sudan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("st", "239", "Sao Tome And Principe", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sv", "503", "El Salvador", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sx", "1", "Sint Maarten", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sy", "963", "Syrian Arab Republic", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("sz", "268", "Swaziland", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tc", "1", "Turks and Caicos Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("td", "235", "Chad", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tg", "228", "Togo", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("th", "66", "Thailand", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tj", "992", "Tajikistan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tk", "690", "Tokelau", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tl", "670", "Timor-leste", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tm", "993", "Turkmenistan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tn", "216", "Tunisia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("to", "676", "Tonga", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tr", "90", "Turkey", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tt", "1", "Trinidad &amp; Tobago", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tv", "688", "Tuvalu", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tw", "886", "Taiwan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("tz", "255", "Tanzania, United Republic Of", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ua", "380", "Ukraine", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ug", "256", "Uganda", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("us", "1", "United States", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("uy", "598", "Uruguay", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("uz", "998", "Uzbekistan", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("va", "379", "Holy See (vatican City State)", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("vc", "1", "Saint Vincent &amp; The Grenadines", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ve", "58", "Venezuela, Bolivarian Republic Of", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("vg", "1", "British Virgin Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("vi", "1", "US Virgin Islands", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("vn", "84", "Vietnam", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("vu", "678", "Vanuatu", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("wf", "681", "Wallis And Futuna", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ws", "685", "Samoa", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("xk", "383", "Kosovo", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("ye", "967", "Yemen", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("yt", "262", "Mayotte", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("za", "27", "South Africa", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("zm", "260", "Zambia", DEFAULT_FLAG_RES))
    countries.add(CCPCountry("zw", "263", "Zimbabwe", DEFAULT_FLAG_RES))
    return countries
}
