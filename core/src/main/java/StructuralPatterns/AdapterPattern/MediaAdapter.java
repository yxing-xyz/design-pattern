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

import StructuralPatterns.AdapterPattern.VideoPlayer.VideoPalyer;
import StructuralPatterns.AdapterPattern.VideoPlayer.Mp4Player;
import StructuralPatterns.AdapterPattern.VideoPlayer.VlcPlayer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/29
 * @since 1.0.0
 */

public class MediaAdapter  {
    VideoPalyer advancedMusicPlayer;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    public void play(String fileName) {
        advancedMusicPlayer.play(fileName);
    }
}