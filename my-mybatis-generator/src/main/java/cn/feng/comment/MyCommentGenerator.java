package cn.feng.comment;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

import java.util.Properties;

/**
 * @author lrf
 */
public class MyCommentGenerator extends DefaultCommentGenerator {

	/**
	 * 由于默认实现类中的可配参数都没有提供给子类可访问的方法，这里要定义一遍
	 */
	private boolean suppressAllComments;
	/**
	 * 同上
	 */
	private boolean addRemarkComments;

	/**
	 * 设置用户配置的参数
	 * @param properties 属性配置文件
	 */
	@Override
	public void addConfigurationProperties(Properties properties){
		// 先调用父类方法保证父类方法可以正常使用
		super.addConfigurationProperties(properties);
		// 获取 suppressAllComments 参数值
		suppressAllComments = StringUtility.isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
		// 获取 addRemarkComments 参数值
		addRemarkComments = StringUtility.isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_ADD_REMARK_COMMENTS));
	}
	
	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
		// 如果阻止生成所有注释，直接返回
		if (suppressAllComments) {
			return;
		}
		// 文档注释开始
		field.addJavaDocLine("/**");
		// 
		
	}
}
