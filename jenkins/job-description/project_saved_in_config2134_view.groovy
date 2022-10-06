 
listView('project_saved_in_config2134 Jobs') {
    description('project_saved_in_config2134 Jobs')
    jobs {
        regex('project_saved_in_config2134_.+')
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
