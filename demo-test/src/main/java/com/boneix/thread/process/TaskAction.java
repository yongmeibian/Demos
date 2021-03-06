package com.boneix.thread.process;

/**
 * 任务回调封装
 * 
 * @author wangchong
 * 
 * @param <T>
 *            返回类型
 */
public interface TaskAction<T> {
	T doInAction() throws Exception;
}

