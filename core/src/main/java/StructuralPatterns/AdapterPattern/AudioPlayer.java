/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AudioPlayer
 * Author:   yuxing1994
 * Date:     2018/8/29 21:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.AdapterPattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/29
 * @since 1.0.0
 */
public class AudioPlayer implements StructuralPatterns.AdapterPattern.Audio.AudioPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //播放 mp3 音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(fileName);
        } else {
            System.out.println("Invalid media. " +
                    audioType + " format not supported");
        }
    }
}