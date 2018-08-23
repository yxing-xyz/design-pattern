/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MediaAdapter
 * Author:   yuxing1994
 * Date:     2018/8/20 21:23
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
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;


    @Override
    public <T> void play(Class<T> cls, String filename) throws IllegalAccessException, InstantiationException {

    }
}