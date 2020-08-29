import java.util.*

fun main() {
    var key1 = "cGVkLmd1aWw1NUBnbWFpbC5jb20iLCJGdWxsTmFtZSI6bnVsbCwiTmFtZSI6IlBlZHJvIiwiU3VybmFtZSI6Ikd1aWxoZXJtZSIsIlBhc3MiOiIiLCJQYXNzQ29uZiI6bnVsbCwiRW1haWwiOiJwZWQuZ3VpbDU1QGdtYWlsLmNvbSIsIkVtYWlsQ29uZiI6bnVsbCwiQ2VscGhvbmUiOiIrNTU4MTk5NTk3OTgzMCIsIkRvY3VtZW50IjoiIiwiVGVybXMiOmZhbHNlLCJUb2tlbiI6IjBiNjFmYzdiODY0ZGQwM2FmZTI5MDUyMzUxOWNiMDc1IiwiVHlwZSI6MiwiSWRVc2VyIjoxMjYwMywiSWRVc2VyUmVmIjowLCJJZFVzZXJJbnZpdGVkIjowLCJLZXkiOiJNSEJsWkM1bmRXbHNOVFZBWjIxaGFXd3VZMjl0TURFdk1EZ3ZNakF5TUNBeE9Eb3dPRG94TlRBeEx6QTRMekl3TWpBZ01UZzZNemc2TVRVd1lqWXhabU0zWWpnMk5HUmtNRE5oWm1VeU9UQTFNak0xTVRsallqQTNOVEU1TVM0eE56a3VNVEEyTGpJek5BPT0iLCJTdGF0dXMiOjIsIkNyZWF0ZWQiOiIyMDIwLTA4LTAxVDE4OjA4OjE1IiwiRXhwaXJlIjoiMjAyMC0wOC0wMVQxODozODoxNSIsIklQIjoiMTkxLjE3OS4xMDYuMjM0IiwiSWRQcm9maWxlIjoyLCJUeXBlTmFtZSI6bnVsbCwiS2VlcEFsaXZlIjpmYWxzZSwiUGVybWlzc2lvbnMiOm51bGx9"
    var key2 = "dmljdG9yLmcucy5iYXRpc3RhQGdtYWlsLmNvbSIsIkZ1bGxOYW1lIjpudWxsLCJOYW1lIjoiVmljdG9yIiwiU3VybmFtZSI6IkdsZWlkc29uIChWaXRpbmhvKSIsIlBhc3MiOiIiLCJQYXNzQ29uZiI6bnVsbCwiRW1haWwiOiJ2aWN0b3IuZy5zLmJhdGlzdGFAZ21haWwuY29tIiwiRW1haWxDb25mIjpudWxsLCJDZWxwaG9uZSI6Iis1NTgxOTk2MzE1NTUwIiwiRG9jdW1lbnQiOiIwODE3MDY0MjQ5MyIsIlRlcm1zIjpmYWxzZSwiVG9rZW4iOiJmNzY4NTliM2JkODU4NTMxZmMzYjI1NTE0MjA3Y2EwMCIsIlR5cGUiOjIsIklkVXNlciI6MTIxNzUsIklkVXNlclJlZiI6MCwiSWRVc2VySW52aXRlZCI6MCwiS2V5IjoiTUhacFkzUnZjaTVuTG5NdVltRjBhWE4wWVVCbmJXRnBiQzVqYjIwd01TOHdPQzh5TURJd0lERTNPalV4T2pFeE1ERXZNRGd2TWpBeU1DQXhPRG95TVRveE1XWTNOamcxT1dJelltUTROVGcxTXpGbVl6TmlNalUxTVRReU1EZGpZVEF3TVRreExqRTNPUzR4TURZdU1qTTAiLCJTdGF0dXMiOjIsIkNyZWF0ZWQiOiIyMDIwLTA4LTAxVDE3OjUxOjExIiwiRXhwaXJlIjoiMjAyMC0wOC0wMVQxODoyMToxMSIsIklQIjoiMTkxLjE3OS4xMDYuMjM0IiwiSWRQcm9maWxlIjoyLCJUeXBlTmFtZSI6bnVsbCwiS2VlcEFsaXZlIjpmYWxzZSwiUGVybWlzc2lvbnMiOm51bGx9"

    var igual1 = ""
    var igual2 = ""
    var countKey1 = key1.length-1
    var countKey2 = key2.length-1
    var continuee = true
    while (continuee){


        countKey1--
        countKey2--


        continuee = key1[countKey1].equals(key2[countKey2])
        if (continuee){
            igual1 += key1[countKey1]
            igual2 += key2[countKey2]
        }
    }
    key1.replace(igual1.reversed(),"")
    key2.replace(igual2.reversed(),"")

    println(key1)
    println(key2)


}