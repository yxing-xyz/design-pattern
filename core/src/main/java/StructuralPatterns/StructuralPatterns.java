package StructuralPatterns; /**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: StructuralPatterns.StructuralPatterns
 * Author:   yuxing1994
 * Date:     2018/8/20 21:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


import StructuralPatterns.AdapterPattern.AudioPlayer;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/20
 * @since 1.0.0
 */
public class StructuralPatterns {
    public static void main(String args[]) {
        System.out.println("结构型设计模式");
        AdapterPattern();
    }

    public static void  AdapterPattern() {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}