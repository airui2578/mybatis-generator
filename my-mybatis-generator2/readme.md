## 使用maven插件逆向生成
第一步：首先先将项目 mvn install 安装到本地仓库。
第二步：在 Goals 中输入 mybatis-generator:generate，可以选择跳过测试
第三部：run。
在pom文件中添加插件：
	<build>
		<plugins>
			<plugin>
				<groupId>org.mybatis.generator</groupId>
				<artifactId>mybatis-generator-maven-plugin</artifactId>
				<version>1.3.5</version>
				<configuration>
					<configurationFile>
						${basedir}/src/main/resources/generator/generatorConfig.xml
					</configurationFile>
					<overwrite>true</overwrite>
					<verbose>true</verbose>
				</configuration>
				<dependencies>
					<dependency>
						<groupId>mysql</groupId>
						<artifactId>mysql-connector-java</artifactId>
						<version>5.1.46</version>
					</dependency>
					此处是项目的坐标
					<dependency>
						<groupId>cn.feng</groupId>
						<artifactId>my-mybatis-generator</artifactId>
						<version>0.0.1-SNAPSHOT</version>
					</dependency>
				</dependencies>
			</plugin>
		</plugins>
	</build>