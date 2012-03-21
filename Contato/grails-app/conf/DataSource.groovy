dataSource {
    pooled = true
    driverClassName = "org.h2.Driver"
    username = "sa"
    password = ""
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			driverClassName = "com.mysql.jdbc.Driver"
			url = "jdbc:mysql://localhost/contato"
			username = "contato"
			password = "contato"
        }
    }
    test {
        dataSource {
            dbCreate = "update"
            url = "jdbc:h2:mem:testDb;MVCC=TRUE"
        }
    }
    production {
			dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			driverClassName = "com.mysql.jdbc.Driver"
			url = "jdbc:mysql://localhost/contato"
			username = "contato"
			password = "contato"
        }
    }
}
