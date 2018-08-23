/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Mp4Player
 * Author:   yuxing1994
 * Date:     2018/8/20 21:22
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
public class Mp4Player implements AdvancedMediaPlayer {


    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("playing mp4 file. file name: " + filename);
    }
}