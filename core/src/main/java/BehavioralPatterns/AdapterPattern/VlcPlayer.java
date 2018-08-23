/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: VlcPlayer
 * Author:   yuxing1994
 * Date:     2018/8/20 21:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package BehavioralPatterns.AdapterPattern;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/20
 * @since 1.0.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String filename) {
        System.out.println("playing vlc file. file name: " + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}