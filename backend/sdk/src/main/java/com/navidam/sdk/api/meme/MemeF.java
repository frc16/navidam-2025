package com.navidam.sdk.api.meme;
 
import com.navidam.sdk.internal.meme.*;
 
public class MemeF {
 
   
String url = Memegen.of(
        MemeTemplate.CAPTAIN_AMERICA.id(),
   
        "celebras navidad?",
        "soy ateo",
        "entonces te voy hacer conocer al yiyus"
).width(800).url();
 
    }