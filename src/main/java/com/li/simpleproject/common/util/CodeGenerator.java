package com.li.simpleproject.common.util;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author kuan
 * @version 1.0
 * @description: myBatisPlus generator
 * @date 2023/10/6 12:12
 */

public class CodeGenerator {
    public static void main(String[] args) {
        List<String> tables = new ArrayList<>();
        tables.add("tb_role_menu");
//        tables.add("p_question");
//        tables.add("p_answer");
//        tables.add("p_correct");

        FastAutoGenerator.create("jdbc:mysql://localhost:3306/local", "root", "root")
                .globalConfig(builder -> {
                    builder.author("lk")
                            .outputDir(System.getProperty("user.dir") + "\\src\\main\\java")//输出路径(写到java目录)
//                            .enableSwagger()           //开启swagger
                            .commentDate("yyyy-MM-dd")//作者
                    ;

                })
                .packageConfig(builder -> {
                    builder
                            .parent("com.li")
                            .moduleName("simpleproject")
                            .entity("entity")
                            .service("service")
                            .serviceImpl("service.impl")
                            .controller("controller")
                            .mapper("dao")
                            .xml("mapper")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, System.getProperty("user.dir") + "\\src\\main\\resources\\mapper"));
                })
                .strategyConfig(builder -> {
                    builder.addInclude(tables)
                            .addTablePrefix("p_")
                            .serviceBuilder()
                            .enableFileOverride()   //开启覆盖之前生成的文件
                            .formatServiceFileName("%sService")
                            .formatServiceImplFileName("%sServiceImpl")
                            .entityBuilder()
                            .enableLombok()
                            .logicDeleteColumnName("deleted")
                            .enableTableFieldAnnotation()
                            .controllerBuilder()
                            // 映射路径使用连字符格式，而不是驼峰
                            .enableHyphenStyle()
                            .formatFileName("%sController")
                            .enableRestStyle()
                            .mapperBuilder()
                            //生成通用的resultMap
                            .enableBaseResultMap()
                            .superClass(BaseMapper.class)
                            .formatMapperFileName("%sMapper")
                            .formatXmlFileName("%sMapper");
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }


}
