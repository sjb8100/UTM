package com.dc.utm.resource.user;

import java.util.Set;

/**
 * 用户资源接口(定义一个用户资源需要实现的方法)
 * 
 * @author Daemon
 *
 * @param <Visitor> 游客
 * @param <UserKey> 用户Id
 * @param <User> 用户
 */
public interface IUserResource<Visitor, UserKey, User> extends IUserResourceEvent<Visitor, UserKey, User> {
	
	/**
	 * 返回正在打开的资源数量（为监控预留接口）
	 * 
	 * @return 正在打开的资源数量
	 */
	int getActiveCount();
	
	/**
	 * 返回正在打开的资源所属的用户Id（为监控预留接口）
	 * 
	 * @return 正在打开的资源所属的用户Id
	 */
	Set<UserKey> getAciveUserId();
	
}
