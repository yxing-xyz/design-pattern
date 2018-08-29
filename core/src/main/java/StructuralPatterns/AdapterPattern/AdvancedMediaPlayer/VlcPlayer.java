/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: VlcPlayer
 * Author:   yuxing1994
 * Date:     2018/8/29 20:58
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.AdapterPattern.AdvancedMediaPlayer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/29
 * @since 1.0.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String filename) {
        System.out.println("Playing vlc file. Name: "+ filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}