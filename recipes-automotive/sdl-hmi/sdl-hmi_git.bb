SUMMARY = "Reference HMI for SmartDeviceLink"
DESCRIPTION = "SmartDeviceLink (SDL) is a standard set of protocols and \
messages that connect applications on a smartphone to a vehicle head \
unit."
HOMEPAGE = "https://www.smartdevicelink.com"
SECTION = "app"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=cf455e8d39d2ded1d85b1c5dea6ec3c5"

SRC_URI = "git://github.com/smartdevicelink/generic_hmi.git;branch=develop"

PV = "0.0.0+git${SRCPV}"
SRCREV = "96c44b8f488977fe1cf29af1a20898187a982b63"

S = "${WORKDIR}/git"

do_install() {
    install -m 644 ${S}/index.html ${datadir}/smartdevicelink/${PN}/
    install -d ${S}/src ${datadir}/smartdevicelink/${PN}/
    install -d ${S}/build ${datadir}/smartdevicelink/${PN}/
    install -d ${S}/fonts ${datadir}/smartdevicelink/${PN}/
}

PACKAGES = " \
    ${PN} \
"

FILES_${PN}_append = " \
    ${datdir}/smartdevicelink/${PN} \
"
