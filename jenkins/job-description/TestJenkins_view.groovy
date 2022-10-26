 
listView('TestJenkins Jobs') {
    description('TestJenkins Jobs')
    jobs {
        regex('TestJenkins_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
