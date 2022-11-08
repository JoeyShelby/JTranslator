package org.joey.jtranslator.entities;

import java.util.List;
import java.util.Map;

/**
 * @author: JoeyShelby
 * @date: 2022-11-07 15:03
 */
public class ReturnPhrase {

    private String errorCode;	//text	错误返回码	一定存在
    private String query;      //	text	源语言	查询正确时，一定存在
    List<String> translation;  //Array	翻译结果	查询正确时，一定存在
    String basic;              //text	词义	基本词典，查词时才有
    Map<String, List<String>> web	; //Array	词义	网络释义，该结果不一定存在
    String   l	;//text	源语言和目标语言	一定存在
    String dict	;//text	词典deeplink	查询语种为支持语言时，存在
    String webdict	;//text	webdeeplink	查询语种为支持语言时，存在
    String tSpeakUrl	;//text	翻译结果发音地址	翻译成功一定存在，需要应用绑定语音合成服务才能正常播放否则返回110错误码
    String speakUrl	; //text	源语言发音地址	翻译成功一定存在，需要应用绑定语音合成服务才能正常播放否则返回110错误码
    List<String> returnPhrase; // 主要校验字母大小写、单词前含符号、中文简繁体


}
