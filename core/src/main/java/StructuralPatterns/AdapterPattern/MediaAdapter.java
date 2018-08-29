/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MediaAdapter
 * Author:   yuxing1994
 * Date:     2018/8/29 21:10
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.AdapterPattern;

import StructuralPatterns.AdapterPattern.AdvancedMediaPlayer.AdvancedMediaPlayer;
import StructuralPatterns.AdapterPattern.AdvancedMediaPlayer.Mp4Player;
import StructuralPatterns.AdapterPattern.AdvancedMediaPlayer.VlcPlayer;
import StructuralPatterns.AdapterPattern.MediaPlayer.MediaPlayer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/29
 * @since 1.0.0
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer vlcPlayer = new VlcPlayer();
    AdvancedMediaPlayer mp4Player = new Mp4Player();

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            mp4Player.playVlc(fileName);
        }
    }
}