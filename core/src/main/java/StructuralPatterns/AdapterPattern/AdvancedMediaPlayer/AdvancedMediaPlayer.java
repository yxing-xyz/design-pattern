/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: AdvanceMediaPlayer
 * Author:   yuxing1994
 * Date:     2018/8/29 20:54
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
public interface AdvancedMediaPlayer {
    public void playVlc(String filename);
    public void playMp4(String filename);
}