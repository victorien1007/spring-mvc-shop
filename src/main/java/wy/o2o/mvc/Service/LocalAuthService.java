package wy.o2o.mvc.service;

import wy.o2o.mvc.dto.LocalAuthExecution;
import wy.o2o.mvc.entity.LocalAuth;
import wy.o2o.mvc.exceptions.LocalAuthOperationException;

public interface LocalAuthService {

	/**
	 * 注册
	 *
	 * @param userName
	 * @return
	 */

	LocalAuthExecution registerLocalAuthByUsernameAndPwd(String userName, String password, int userType);
	/**
	 * 通过帐号和密码获取平台帐号信息
	 * 
	 * @param userName
	 * @return
	 */
	LocalAuth getLocalAuthByUsernameAndPwd(String userName, String password);

	/**
	 * 通过userId获取平台帐号信息
	 * 
	 * @param userId
	 * @return
	 */
	LocalAuth getLocalAuthByUserId(long userId);

	/**
	 * 绑定微信，生成平台专属的帐号
	 * 
	 * @param localAuth
	 * @return
	 * @throws RuntimeException
	 */
	LocalAuthExecution bindLocalAuth(LocalAuth localAuth) throws LocalAuthOperationException;

	/**
	 * 修改平台帐号的登录密码
	 * 
	 * @param localAuthId
	 * @param userName
	 * @param password
	 * @param newPassword
	 * @param lastEditTime
	 * @return
	 */
	LocalAuthExecution modifyLocalAuth(Long userId, String username, String password, String newPassword)
			throws LocalAuthOperationException;
}
