dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "com.mysql.jdbc.Driver"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
//    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create" // one of 'create', 'create-drop', 'update', 'validate', ''
            url = "jdbc:mysql://localhost/robovelc?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "mysqlmysql"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            uurl = "jdbc:mysql://localhost/robovelc?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "mysqlmysql"
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            url = "jdbc:mysql://localhost/robovelc?useUnicode=yes&characterEncoding=UTF-8"
            username = "root"
            password = "mysqlmysql"
        }
    }
}
