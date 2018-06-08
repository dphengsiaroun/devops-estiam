job('samplephpv1') {
    description 'samplephpv1'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/dphengsiaroun/devops-partie-1.git')
                }
                branch('v1')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('dphengsiaroun/devops01')
            registryCredentials('d8ffb529-4cde-48c8-b14e-6db3f217306e')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
}

job('samplephpv2') {
    description 'samplephpv2'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/dphengsiaroun/devops-partie-1.git')
                }
                branch('v2')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }
    steps {
        dockerBuildAndPublish {
            repositoryName('dphengsiaroun/devops02')
            registryCredentials('d8ffb529-4cde-48c8-b14e-6db3f217306e')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }

}

job('samplephpv3') {
    description 'samplephpv3'
    scm {
        git {
            remote {
                    name('origin')
                    url('https://github.com/dphengsiaroun/devops-partie-1.git')
                }
                branch('v3')
            }
        }

    triggers{
        scm('H/15 * * * *')
    }  
    steps {
        dockerBuildAndPublish {
            repositoryName('dphengsiaroun/devops03')
            registryCredentials('d8ffb529-4cde-48c8-b14e-6db3f217306e')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
}