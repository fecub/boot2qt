##############################################################################
##
## Copyright (C) 2016 The Qt Company Ltd.
## Contact: http://www.qt.io/licensing/
##
## This file is part of the Boot to Qt meta layer.
##
## $QT_BEGIN_LICENSE:COMM$
##
## Commercial License Usage
## Licensees holding valid commercial Qt licenses may use this file in
## accordance with the commercial license agreement provided with the
## Software or, alternatively, in accordance with the terms contained in
## a written agreement between you and The Qt Company. For licensing terms
## and conditions see http://www.qt.io/terms-conditions. For further
## information use the contact form at http://www.qt.io/contact-us.
##
## $QT_END_LICENSE$
##
##############################################################################

SUMMARY = "Noto Sans CJK"
SECTION = "fonts"
HOMEPAGE = "http://www.google.com/get/noto"
LICENSE = "OFL-1.1"
LIC_FILES_CHKSUM = "file://${WORKDIR}/LICENSE_OFL.txt;md5=55719faa0112708e946b820b24b14097"

INHIBIT_DEFAULT_DEPS = "1"

inherit allarch fontcache

PV = "1.004"
SRC_URI = "https://noto-website-2.storage.googleapis.com/pkgs/NotoSansCJKsc-hinted.zip"

SRC_URI[md5sum] = "539a04d2a14a12096897f84ba046d110"
SRC_URI[sha256sum] = "c0a77b24ce1964c5d244be7576ada5899d681638e0abd0917e6a661df56e0232"

S = "${WORKDIR}"

do_install() {
    install -m 0755 -d ${D}${datadir}/fonts/otf/noto
    install -m 0644 ${WORKDIR}/*.otf ${D}${datadir}/fonts/otf/noto
}

PACKAGES = "${PN}"
FILES_${PN} += "${datadir}/fonts/otf/noto"
