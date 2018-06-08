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
            registryCredentials('5ce9d9bd-c50f-4f9f-91d6-185c5d1cae6f')
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
            registryCredentials('5ce9d9bd-c50f-4f9f-91d6-185c5d1cae6f')
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
            registryCredentials('5ce9d9bd-c50f-4f9f-91d6-185c5d1cae6f')
            buildContext('nginx-php-fpm')
            forcePull(true)
            createFingerprints(false)
            skipDecorate()           
        }
    }
}