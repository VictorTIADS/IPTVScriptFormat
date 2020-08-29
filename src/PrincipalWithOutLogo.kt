fun main() {
    var bruto = "#EXTINF:-1,Discovery Channel HD\n" +
            "http://live02-cdn.tv.ti.ru:80/dtv/id247_NBN_SG--DiscoveryChannelHD/04/plst.m3u8\n" +
            "#EXTINF:-1,Discovery Science\n" +
            "http://live02-cdn.tv.ti.ru/dtv/id248_NBN_SG--DiscoveryScienceHD/04/plst.m3u8\n" +
            "#EXTINF:-1,Discovery Science HD\n" +
            "http://live02-cdn.tv.ti.ru:80/dtv/id248_NBN_SG--DiscoveryScienceHD/04/plst.m3u8\n" +
            "#EXTINF:-1,Discovery Science HD\n" +
            "http://live02-cdn.tv.ti.ru/dtv/id248_NBN_SG--DiscoveryScienceHD/03/plst.m3u8\n" +
            "#EXTINF:-1,Discovery Showcase HD\n" +
            "http://54.38.180.196/play/272/2D6E866C992891C/video.m3u8\n" +
            "#EXTINF:-1,Investigation Discovery\n" +
            "http://77.89.204.107:8000/play/a0b8/index.m3u8\n" +
            "#EXTINF:-1,National Geographic HD\n" +
            "http://live02-cdn.tv.ti.ru:80/dtv/id373_NBN_SG--Nat_Geo_HD/04/plst.m3u8\n" +
            "#EXTINF:-1,Nat Geo Wild HD\n" +
            "http://live02-cdn.tv.ti.ru:80/dtv/id374_NBN_SG--NatGeo_Wild_HD/04/plst.m3u8\n" +
            "#EXTINF:0,National Geographic HD\n" +
            "http://live-ng-01.more.tv/hls/NGC_HD/master.m3u8\n" +
            "#EXTINF:-1 ,National Geographic Wild HD\n" +
            "https://sc.id-tv.kz/NatGeoWildHD_34_35.m3u8\n" +
            "#EXTINF:-1 ,National Geographic Wild\n" +
            "http://188.35.9.5:10020/stolen/487n/hot.dll\n" +
            "#EXTINF:0,Da Vinci\n" +
            "https://sc.id-tv.kz/DaVinci_34_35.m3u8\n" +
            "#EXTINF:-1,hdl HD\n" +
            "https://sc.id-tv.kz/hdl_34_35.m3u8\n" +
            "#EXTINF:-1 ,HD life\n" +
            "http://37.193.6.155:34040/udp/239.1.9.2:1234\n" +
            "#EXTINF:-1 ,HDL HD\n" +
            "http://89.106.234.3:80/hdl_34_35.m3u8\n" +
            "#EXTINF:-1,Animal Planet HD\n" +
            "http://live02-cdn.tv.ti.ru:80/dtv/id112_NBN_SG--AnimalPlannetHD/04/plst.m3u8\n" +
            "#EXTINF:-1,Outdoor Channel\n" +
            "http://live02-cdn.tv.ti.ru:80/dtv/id1122_NBN_SG--OutdoorSD/03/plst.m3u8\n" +
            "#EXTINF:-1,DTX\n" +
            "http://live02-cdn.tv.ti.ru:80/dtv/id204_NBN_SG--DiscoveryWorld/03/plst.m3u8"



    bruto = bruto.replace("\n","")
    bruto = bruto.replace("#EXTINF:0,"," #")
    bruto = bruto.replace("#EXTINF:-1, "," #")
    bruto = bruto.replace("#EXTINF:-1,"," #")
    bruto = bruto.replace("#EXTINF:-1 ,"," #")

    bruto = bruto.replace("htt"," , htt")


    var channels = bruto.split("#")
    //print(bruto)
    for (i in 1 until channels.size){
        var ok = channels[i].split(",")

        if (ok.isNotEmpty()){
            var id = ok[0]
            var name = ok[0]
            var logo = ""
            var category = ""
           var url = ok[1].replace(" ","")


            println("ChannelMaster(\"${id.replace(" ","").plus("")}\",\"${name}\",\"$category\",\"${id.replace("","")}\",\"${logo.replace(" ","")}\",\"HD\",\"$url\",true),")

        }


    }

}